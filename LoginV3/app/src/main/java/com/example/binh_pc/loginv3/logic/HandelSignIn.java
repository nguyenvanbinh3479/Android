package com.example.binh_pc.loginv3.logic;

import com.example.binh_pc.loginv3.common.Common;
import com.example.binh_pc.loginv3.inview.SignInView;
import com.example.binh_pc.loginv3.inview.SignUpView;
import com.example.binh_pc.loginv3.onview.OnSignIn;

/**
 * Created by BINH-PC on 12/1/2018.
 */

public class HandelSignIn implements OnSignIn{


    SignInView signview;

    public HandelSignIn(SignInView signInView){
        this.signview = signInView;
    }

    @Override
    public void handelSignIn(String a, String b) {

        if(a.equals(Common.currentUser.getEmail()) && b.equals(Common.currentUser.getPassword()))signview.signInSussess();
        else{
            signview.signInFail();
        }
    }
}

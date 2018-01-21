package com.example.binh_pc.loginv3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.binh_pc.loginv3.common.Common;
import com.example.binh_pc.loginv3.inview.SignInView;
import com.example.binh_pc.loginv3.inview.SignUpView;
import com.example.binh_pc.loginv3.logic.HandelSignIn;
import com.example.binh_pc.loginv3.logic.HandelSignUp;
import com.example.binh_pc.loginv3.model.Users;

public class MainActivity extends AppCompatActivity implements SignUpView, SignInView, View.OnClickListener{

    EditText edEmail, edPassword;
    Button btnSignIn, btnSignUp;
    
    HandelSignUp handelSignUp;
    HandelSignIn handelSignIn;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edEmail = findViewById(R.id.edEmail);
        edPassword = findViewById(R.id.edPassword);
        btnSignIn = findViewById(R.id.btnSignIn);
        btnSignUp = findViewById(R.id.btnSignUp);
       
        
        btnSignUp.setOnClickListener(this);
        btnSignIn.setOnClickListener(this);
        

    }


    @Override
    public void onClick(View view) {
        
        String email = edEmail.getText().toString();
        String password = edPassword.getText().toString();
        
        int id = view.getId();
        
        if(id == R.id.btnSignUp){
//            handelSignUp.handelSignUp(email, password);
        }else if(id ==R.id.btnSignIn){
            handelSignIn.handelSignIn(email,password);
        }
        
    }

    @Override
    public void signInSussess() {

        Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
        
    }

    @Override
    public void signInFail() {

    }

    @Override
    public void signUpSussess() {

    }

    @Override
    public void signUpFail() {

    }
}

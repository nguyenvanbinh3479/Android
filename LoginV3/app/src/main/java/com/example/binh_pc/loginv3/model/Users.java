package com.example.binh_pc.loginv3.model;

import com.example.binh_pc.loginv3.common.Common;

import java.util.ArrayList;

/**
 * Created by BINH-PC on 12/1/2018.
 */

public class Users {

    private String email;
    private String password;
    public ArrayList<Users> list;
    public Users() {

    }

    public Users(String email, String password) {
        this.email = email;
        this.password = password;

        list.add(new Users("binhnguyen","123"));
        list.add(new Users("binhnguyen1","12345"));

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package com.example.latest;

public class User implements UserInterface{
    String userName;
    String email;
    String password;

    public User(String userName,String email,String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }


    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }
}

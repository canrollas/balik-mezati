package com.example.latest;

public class User implements UserInterface{
    // Variable declarations
    private String userName;
    private String email;
    private String password;
    // Constructor
    public User(String userName,String email,String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    // Overriden methods 
    @Override
    public String getUserName() {
        return this.userName;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String getPassword() {
        return this.password;
    }


    @Override
    public String toString() {
        return "{" +
            " userName='" + getUserName() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            "}";
    }
}

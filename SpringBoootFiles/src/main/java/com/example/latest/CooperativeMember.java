package com.example.latest;

public class CooperativeMember extends User{
    // Variable declarations.
    private String code;

    // Constructor
    public CooperativeMember(String userName, String email, String password, String code) {
        super(userName, email, password);
        this.code = code;
    }

    // returns cooperative member's special code in register.
    public String getCode(){
        return this.code;
    }

}

package com.example.latest;

import java.util.ArrayList;

public class Customer extends User{
    private String address;
    private String name;
    private String surname;
    private ArrayList<CreditCard> carts;

    public Customer(String userName, String email, String password) {
        super(userName, email, password);
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<CreditCard> getCarts() {
        return carts;
    }
}

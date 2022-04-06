package com.example.latest;

public class BankAccount {

    private String Iban;
    private String owner;

    public String getOwner() {
        return owner;
    }

    public String getIban() {
        return Iban;
    }

    public void setIban(String iban) {
        Iban = iban;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

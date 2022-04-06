package com.example.latest;

import java.util.ArrayList;

public class FisherMan extends User {

    private ArrayList<BankAccount> bankAccounts;

    public FisherMan(String userName, String email, String password) {
        super(userName, email,password);
    }

    public ArrayList<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public boolean addBankAccount(String Iban, String owner) {
        try {
            BankAccount newAccount = new BankAccount();
            newAccount.setIban(Iban);
            newAccount.setOwner(owner);
            bankAccounts.add(newAccount);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}

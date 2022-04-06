package com.example.latest;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.UUID;

public class FisherMan extends User {

    private ArrayList<BankAccount> bankAccounts;
    @Id
    private String userId;
    public FisherMan(String userName, String email, String password) {
        super(userName, email,password);
        String uuid = UUID.randomUUID().toString();
        userId = "uuid = " + uuid;
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

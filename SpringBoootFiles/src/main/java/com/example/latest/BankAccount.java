package main.java.com.example.latest;

public class BankAccount {
    // Variable declarations.
    private String iban;
    private User owner;

    // Constructor
    public BankAccount(String iban, User owner){
        this.iban = iban;
        this.owner = owner;
    }

    // Getters and Setters
    public String getIban(){
        return this.iban;
    }

    public User getOwner(){
        return this.owner;
    }

    public void setIban(String newIban){
        this.iban = newIban;
    }

    public void setOwner(User newOwner){
        this.owner = newOwner;
    }
}

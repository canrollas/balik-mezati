package main.java.com.example.latest;

public class Fisherman extends User {
    // Variable declarations.
    private BankAccount bankAccount;

    // Constructor
    public Fisherman(String userName, String email, String password, BankAccount bankAccount) {
        super(userName, email, password);
        this.bankAccount = bankAccount;
    }
    
    // Getters and Setters
    public BankAccount getBankAccount(){
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount newBankAccount){
        this.bankAccount = newBankAccount;
    }
    

    @Override
    public String toString() {
        return "{" +
            " bankAccount='" + getBankAccount() + "'" +
            "}";
    }

}

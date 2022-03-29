package main.java.com.example.latest;

import java.util.List;

public class Customer extends User {
    // Variable declarations
    private String address;
    private String surname;
    private List<CreditCard> cards;

    // Constructor
    public Customer(String userName, String email, String password, String address, String surname, List<CreditCard> cards) {
        super(userName, email, password);
        this.address = address;
        this.surname = surname;
        this.cards = cards;
    }

    // Getters and Setters
    public String getAddress(){
        return this.address;
    }

    public List<CreditCard> getCreditCards(){
        return this.cards;
    }

    public void setAddress(String newAddress){
        this.address = newAddress;
    }

    public void setCreditCards(List<CreditCard> newCards){
        this.cards = newCards;
    }
    
}

package main.java.com.example.latest;

public class CreditCard {
    private String cardNumber;
    private String name;
    private String surname;

    public CreditCard(String cardNumber, String name, String surname){
        this.cardNumber = cardNumber;
        this.name = name;
        this.surname = surname;
    }

    public String operation(){
        // Redirect to the operation base.
        return 0;
    }

    // Getters And Setters
    public String getCardNumber(){
        return this.cardNumber;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setCardNumber(String newCardNumber){
        this.cardNumber = newCardNumber;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setSurname(String newSurname){
        this.surname = newSurname;
    }
}

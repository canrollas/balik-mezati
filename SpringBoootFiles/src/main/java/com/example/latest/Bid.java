package main.java.com.example.latest;
import java.sql.Timestamp;

public class Bid {
    // Variable declarations
    Float amount;
    Timestamp time;
    String customerId;

    // Constructor
    public Bid(Float amount, Timestamp time, String customerId) {
        this.amount = amount;
        this.time = time;
        this.customerId = customerId;
    }

    // Compare method
    public Bid compare(){
        // Compare method will be implemented
        return this;
    }

    // Getters and setters
    public Float getAmount() {
        return this.amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Timestamp getTime() {
        return this.time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


    @Override
    public String toString() {
        return "{" +
            " amount='" + getAmount() + "'" +
            ", time='" + getTime() + "'" +
            ", customerId='" + getCustomerId() + "'" +
            "}";
    }

    
}

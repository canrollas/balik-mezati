package main.java.com.example.latest;

public class Sale {
    private Fish fish;
    private Float price;
    private Customer buyer;
    private String status;


    public Sale(Fish fish, Float price, Customer buyer, String status) {
        this.fish = fish;
        this.price = price;
        this.buyer = buyer;
        this.status = status;
    }


    public Fish getFish() {
        return this.fish;
    }

    public void setFish(Fish fish) {
        this.fish = fish;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Customer getBuyer() {
        return this.buyer;
    }

    public void setBuyer(Customer buyer) {
        this.buyer = buyer;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "{" +
            " fish='" + getFish() + "'" +
            ", price='" + getPrice() + "'" +
            ", buyer='" + getBuyer() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }

    
}

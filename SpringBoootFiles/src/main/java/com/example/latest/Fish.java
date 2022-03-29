package main.java.com.example.latest;

public class Fish {
    // Variable declaration
    private String id;
    private String type;
    private String status;
    private Integer weight;
    private Integer price;
    private Integer fishermanId;

    // Constructor
    public Fish(String id, String type, String status, Integer weight, Integer price, Integer fishermanId) {
        this.id = id;
        this.type = type;
        this.status = status;
        this.weight = weight;
        this.price = price;
        this.fishermanId = fishermanId;
    }

    // Getters and Setters
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getFishermanId() {
        return this.fishermanId;
    }

    public void setFishermanId(Integer fishermanId) {
        this.fishermanId = fishermanId;
    }

    // Print all variables
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", type='" + getType() + "'" +
            ", status='" + getStatus() + "'" +
            ", weight='" + getWeight() + "'" +
            ", price='" + getPrice() + "'" +
            ", fishermanId='" + getFishermanId() + "'" +
            "}";
    }
    
}

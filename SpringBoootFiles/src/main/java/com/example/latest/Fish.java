package com.example.latest;

import java.util.UUID;

public class Fish {
    private String type;
    private String status;
    private String wight;
    private String price;
    private String FisherManID;
    private String id;

    public Fish( String type, String status, String wight, String price, String fisherManID) {
        String uuid = UUID.randomUUID().toString();
        id = "uuid = " + uuid;
        this.type = type;
        this.status = status;
        this.wight = wight;
        this.price = price;
        FisherManID = fisherManID;
    }

    public String getId() {
        return id;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWight() {
        return wight;
    }

    public void setWight(String wight) {
        this.wight = wight;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFisherManID() {
        return FisherManID;
    }

    public void setFisherManID(String fisherManID) {
        FisherManID = fisherManID;
    }
}

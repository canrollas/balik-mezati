package com.example.latest;


import java.util.ArrayList;

public class CooperativeMemberController {
    boolean videoStreamOn = false;

    public boolean registerFisherman(String password, String email, String userName, String Iban, String Owner) {
        try {
            FisherMan fisherManObj = new FisherMan(userName, email, password);
            fisherManObj.addBankAccount(Iban, Owner);
            return true;
            // This part of the code assumes that we are adding it to database.
        } catch (Exception err) {
            err.printStackTrace();
            return false;
        }

    }

    public void initiateVideoStream() {
        videoStreamOn = true;
    }
    public boolean addFish(String type,String status,String weight,String price,String fisherManId){
        try {
            Fish fishObject = new Fish(type,status, weight,price,fisherManId);
            // This part of the code assumes that we are adding it to database.
            return true;
        }catch (Exception error){
            error.printStackTrace();
            return false;
        }
    }
    public boolean changeFishStatus(String status, String fishId){
        // assuming that we are finding from database in these down bellow lines.
        return true;
    }
    public ArrayList<Fish> getUnsoldFish(){
        // assuming that we are making query  to database for finding the unsold fishes.
        return null;
    }

}

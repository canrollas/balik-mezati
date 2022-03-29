package main.java.com.example.latest;

public class Timer {
    private Float timeForNextBid;


    public Timer(Float timeForNextBid) {
        this.timeForNextBid = timeForNextBid;
    }

    public void resetTimer(){

    }

    public void tick(){
        
    }

    public Float getTimeForNextBid() {
        return this.timeForNextBid;
    }

    public void setTimeForNextBid(Float timeForNextBid) {
        this.timeForNextBid = timeForNextBid;
    }


    @Override
    public String toString() {
        return "{" +
            " timeForNextBid='" + getTimeForNextBid() + "'" +
            "}";
    }

}

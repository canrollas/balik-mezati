package main.java.com.example.latest;

public class Auction {
    private Date date;
    private String name;
    private String id;
    private Integer quota;


    public Auction(Date date, String name, String id, Integer quota) {
        this.date = date;
        this.name = name;
        this.id = id;
        this.quota = quota;
    }


    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getQuota() {
        return this.quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }


    @Override
    public String toString() {
        return "{" +
            " date='" + getDate() + "'" +
            ", name='" + getName() + "'" +
            ", id='" + getId() + "'" +
            ", quota='" + getQuota() + "'" +
            "}";
    }

}

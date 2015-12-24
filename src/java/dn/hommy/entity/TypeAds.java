
package dn.hommy.entity;


public class TypeAds {

    private String type_ads;
    private String location;
    private long cost;
    private int deadline_month;
    private String illustration;

    public TypeAds() {
    }

    public String getType_ads() {
        return type_ads;
    }

    public void setType_ads(String type_ads) {
        this.type_ads = type_ads;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public int getDeadline_month() {
        return deadline_month;
    }

    public void setDeadline_month(int deadline_month) {
        this.deadline_month = deadline_month;
    }

    public String getIllustration() {
        return illustration;
    }

    public void setIllustration(String illustration) {
        this.illustration = illustration;
    }
    
}

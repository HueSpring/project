
package dn.hommy.entity;

import java.util.Date;


public class ReportAds {

    private int idreport_ads;
    private String manager_username;
    private int quantity_ads;
    private int quantity_ads_checked;
    private int quantity_ads_nochecked;
    private int quantity_member_ads;
    private long revenue;
    private int month_report;
    private int year_report;
    private Date time_report_ads;
    private int check;
    private Date time_check;
    private String manager_username_check;

    public ReportAds() {
    }

    public int getIdreport_ads() {
        return idreport_ads;
    }

    public void setIdreport_ads(int idreport_ads) {
        this.idreport_ads = idreport_ads;
    }

    public String getManager_username() {
        return manager_username;
    }

    public void setManager_username(String manager_username) {
        this.manager_username = manager_username;
    }

    public int getQuantity_ads() {
        return quantity_ads;
    }

    public void setQuantity_ads(int quantity_ads) {
        this.quantity_ads = quantity_ads;
    }

    public int getQuantity_ads_checked() {
        return quantity_ads_checked;
    }

    public void setQuantity_ads_checked(int quantity_ads_checked) {
        this.quantity_ads_checked = quantity_ads_checked;
    }

    public int getQuantity_ads_nochecked() {
        return quantity_ads_nochecked;
    }

    public void setQuantity_ads_nochecked(int quantity_ads_nochecked) {
        this.quantity_ads_nochecked = quantity_ads_nochecked;
    }

    public int getQuantity_member_ads() {
        return quantity_member_ads;
    }

    public void setQuantity_member_ads(int quantity_member_ads) {
        this.quantity_member_ads = quantity_member_ads;
    }

    public long getRevenue() {
        return revenue;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }

    public int getMonth_report() {
        return month_report;
    }

    public void setMonth_report(int month_report) {
        this.month_report = month_report;
    }

    public int getYear_report() {
        return year_report;
    }

    public void setYear_report(int year_report) {
        this.year_report = year_report;
    }

    public Date getTime_report_ads() {
        return time_report_ads;
    }

    public void setTime_report_ads(Date time_report_ads) {
        this.time_report_ads = time_report_ads;
    }

    public int getCheck() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
    }

    public Date getTime_check() {
        return time_check;
    }

    public void setTime_check(Date time_check) {
        this.time_check = time_check;
    }

    public String getManager_username_check() {
        return manager_username_check;
    }

    public void setManager_username_check(String manager_username_check) {
        this.manager_username_check = manager_username_check;
    }

}

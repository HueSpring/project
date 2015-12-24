
package dn.hommy.entity;

import java.util.Date;


public class ReportPost {

    private int idreport_post;
    private String manager_username;
    private String type_topic;
    private int quantity_post;
    private int quantity_post_checked;
    private int quantity_post_nochecked;
    private int quantity_member_post;
    private int month_report;
    private int year_report;
    private Date time_report_post;
    private int check;
    private Date time_check;
    private String manager_username_check;

    public ReportPost() {
    }

    public int getIdreport_post() {
        return idreport_post;
    }

    public void setIdreport_post(int idreport_post) {
        this.idreport_post = idreport_post;
    }

    public String getManager_username() {
        return manager_username;
    }

    public void setManager_username(String manager_username) {
        this.manager_username = manager_username;
    }

    public String getType_topic() {
        return type_topic;
    }

    public void setType_topic(String type_topic) {
        this.type_topic = type_topic;
    }

    public int getQuantity_post() {
        return quantity_post;
    }

    public void setQuantity_post(int quantity_post) {
        this.quantity_post = quantity_post;
    }

    public int getQuantity_post_checked() {
        return quantity_post_checked;
    }

    public void setQuantity_post_checked(int quantity_post_checked) {
        this.quantity_post_checked = quantity_post_checked;
    }

    public int getQuantity_post_nochecked() {
        return quantity_post_nochecked;
    }

    public void setQuantity_post_nochecked(int quantity_post_nochecked) {
        this.quantity_post_nochecked = quantity_post_nochecked;
    }

    public int getQuantity_member_post() {
        return quantity_member_post;
    }

    public void setQuantity_member_post(int quantity_member_post) {
        this.quantity_member_post = quantity_member_post;
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

    public Date getTime_report_post() {
        return time_report_post;
    }

    public void setTime_report_post(Date time_report_post) {
        this.time_report_post = time_report_post;
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

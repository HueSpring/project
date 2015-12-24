
package dn.hommy.entity;

import java.util.Date;


public class ReportMember {
    
    private int idreport_member;
    private String manager_username;
    private int quantity_member_new;
    private int quantity_member;
    private int month_report;
    private int year_report;
    private Date time_report_member;
    private int check;
    private Date time_check;
    private String manager_username_check;

    public ReportMember() {
    }

    public int getIdreport_member() {
        return idreport_member;
    }

    public void setIdreport_member(int idreport_member) {
        this.idreport_member = idreport_member;
    }

    public String getManager_username() {
        return manager_username;
    }

    public void setManager_username(String manager_username) {
        this.manager_username = manager_username;
    }

    public int getQuantity_member_new() {
        return quantity_member_new;
    }

    public void setQuantity_member_new(int quantity_member_new) {
        this.quantity_member_new = quantity_member_new;
    }

    public int getQuantity_member() {
        return quantity_member;
    }

    public void setQuantity_member(int quantity_member) {
        this.quantity_member = quantity_member;
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

    public Date getTime_report_member() {
        return time_report_member;
    }

    public void setTime_report_member(Date time_report_member) {
        this.time_report_member = time_report_member;
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


package dn.hommy.entity;

import java.util.Date;


public class SavePost {

    private String member_username;
    private int post_idpost;
    private Date time_save;

    public SavePost() {
    }

    public String getMember_username() {
        return member_username;
    }

    public void setMember_username(String member_username) {
        this.member_username = member_username;
    }

    public int getPost_idpost() {
        return post_idpost;
    }

    public void setPost_idpost(int post_idpost) {
        this.post_idpost = post_idpost;
    }

    public Date getTime_save() {
        return time_save;
    }

    public void setTime_save(Date time_save) {
        this.time_save = time_save;
    }
    
}

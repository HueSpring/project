
package dn.hommy.entity;

import java.util.Date;


public class Comment {

    private int idcomment;
    private int post_idpost;
    private String content;
    private Date time_comment;
    private String username;

    public Comment() {
    }

    public int getIdcomment() {
        return idcomment;
    }

    public void setIdcomment(int idcomment) {
        this.idcomment = idcomment;
    }

    public int getPost_idpost() {
        return post_idpost;
    }

    public void setPost_idpost(int post_idpost) {
        this.post_idpost = post_idpost;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime_comment() {
        return time_comment;
    }

    public void setTime_comment(Date time_comment) {
        this.time_comment = time_comment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
}

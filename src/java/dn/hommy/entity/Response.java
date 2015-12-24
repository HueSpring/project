
package dn.hommy.entity;

import java.util.Date;


public class Response {

    private int idresponse;
    private int idpost;
    private String username_sender;
    private String username_receiver;
    private String subject;
    private String content;
    private Date time_response;

    public Response() {
    }

    public int getIdresponse() {
        return idresponse;
    }

    public void setIdresponse(int idresponse) {
        this.idresponse = idresponse;
    }

    public int getIdpost() {
        return idpost;
    }

    public void setIdpost(int idpost) {
        this.idpost = idpost;
    }

    public String getUsername_sender() {
        return username_sender;
    }

    public void setUsername_sender(String username_sender) {
        this.username_sender = username_sender;
    }

    public String getUsername_receiver() {
        return username_receiver;
    }

    public void setUsername_receiver(String username_receiver) {
        this.username_receiver = username_receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime_response() {
        return time_response;
    }

    public void setTime_response(Date time_response) {
        this.time_response = time_response;
    }
    
}

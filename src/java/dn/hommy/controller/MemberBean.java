

package dn.hommy.controller;

import dn.hommy.entity.Member;
import dn.hommy.entity.SavePost;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class MemberBean {

    private Member member = new Member();
    private SavePost savePost = new SavePost();
    private String message;
    
    public MemberBean() {
    }
    
    
    
    
    
    
    
    
    /*-----------------------------------------------------------------*/

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public SavePost getSavePost() {
        return savePost;
    }

    public void setSavePost(SavePost savePost) {
        this.savePost = savePost;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return member.getUsername();
    }

    public void setUsername(String username) {
        member.setUsername(username);
    }

    public String getPassword() {
        return member.getPassword();
    }

    public void setPassword(String password) {
        member.setPassword(password);
    }

    public String getFirstname() {
        return member.getFirstname();
    }

    public void setFirstname(String firstname) {
        member.setFirstname(firstname);
    }

    public String getLastname() {
        return member.getLastname();
    }

    public void setLastname(String lastname) {
        member.setLastname(lastname);
    }

    public String getCity() {
        return member.getCity();
    }

    public void setCity(String city) {
        member.setCity(city);
    }

    public String getAvatar() {
        return member.getAvatar();
    }

    public void setAvatar(String avatar) {
        member.setAvatar(avatar);
    }

    public String getGender() {
        return member.getGender();
    }

    public void setGender(String gender) {
        member.setGender(gender);
    }

    public String getPhone() {
        return member.getPhone();
    }

    public void setPhone(String phone) {
        member.setPhone(phone);
    }

    public String getEmail() {
        return member.getEmail();
    }

    public void setEmail(String email) {
        member.setEmail(email);
    }

    public Date getTime_create_acc() {
        return member.getTime_create_acc();
    }

    public void setTime_create_acc(Date time_create_acc) {
        member.setTime_create_acc(time_create_acc);
    }

    public String getMember_username() {
        return savePost.getMember_username();
    }

    public void setMember_username(String member_username) {
        savePost.setMember_username(member_username);
    }

    public int getPost_idpost() {
        return savePost.getPost_idpost();
    }

    public void setPost_idpost(int post_idpost) {
        savePost.setPost_idpost(post_idpost);
    }

    public Date getTime_save() {
        return savePost.getTime_save();
    }

    public void setTime_save(Date time_save) {
        savePost.setTime_save(time_save);
    }
    
}

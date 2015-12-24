package dn.hommy.controller;

import dn.hommy.dao.ManagerDao;
import dn.hommy.entity.Manager;
import dn.hommy.entity.Roles;
import java.sql.SQLException;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ManagerBean {

    private Manager manager = new Manager();
    private Roles roles = new Roles();
    private String message;

    public ManagerBean() {
    }

    //find manager by username
    public Manager getManagerByUsername(String username) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        ManagerDao dao = new ManagerDao();
        return dao.findManagerByUsernameDao(username);
    }

    //check username - true: same
    public boolean checkUsername(String username) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Manager item = getManagerByUsername(username);
        if (item.getUsername() != null) {
            return true;
        }
        return false;
    }

    //create new admin - enter: username, password
    public void createNewAdmin() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        if (checkUsername(manager.getUsername())) {
            Date date = new Date();
            manager.setTime_create_acc(date);
            ManagerDao dao = new ManagerDao();
            dao.createNewManagerShortDao(manager.getUsername(), manager.getPassword(), manager.getTime_create_acc());
            roles.setRole("Administrator");
            dao.createNewRolesDao(manager.getUsername(), roles.getRole(), null, null);
        }else{
            message = "Username has been exist";
        }
    }

    //create new mod - enter: username, password & type_topic
    public void createNewModHasTypeTopic() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        if (!checkUsername(manager.getUsername())) {
            Date date = new Date();
            manager.setTime_create_acc(date);
            ManagerDao dao = new ManagerDao();
            dao.createNewManagerShortDao(manager.getUsername(), manager.getPassword(), manager.getTime_create_acc());
            roles.setManager_username(manager.getUsername());
            roles.setRole("Moderator");
            roles.setTime_create_mission(date);
            dao.createNewRolesDao(roles.getManager_username(), roles.getRole(), roles.getType_topic() , roles.getTime_create_mission());
            message = "success";
        }else{
            message = "Username has been exist";
        }
    }

    //check roles - true: has
//    public boolean checkRole(){
//        
//    }
    
   

    /*-----------------------------------------------------------------------------------------------------------------------------*/
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Roles getRoles() {
        return roles;
    }
    
    public void setRoles(Roles roles) {    
        this.roles = roles;
    }

    public String getUsername() {
        return manager.getUsername();
    }

    public void setUsername(String username) {
        manager.setUsername(username);
    }

    public String getPassword() {
        return manager.getPassword();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPassword(String password) {
        manager.setPassword(password);
    }

    public String getFirstname() {
        return manager.getFirstname();
    }

    public void setFirstname(String firstname) {
        manager.setFirstname(firstname);
    }

    public String getLastname() {
        return manager.getLastname();
    }

    public void setLastname(String lastname) {
        manager.setLastname(lastname);
    }

    public String getCity() {
        return manager.getCity();
    }

    public void setCity(String city) {
        manager.setCity(city);
    }

    public String getAvatar() {
        return manager.getAvatar();
    }

    public void setAvatar(String avatar) {
        manager.setAvatar(avatar);
    }

    public String getGender() {
        return manager.getGender();
    }

    public void setGender(String gender) {
        manager.setGender(gender);
    }

    public String getPhone() {
        return manager.getPhone();
    }

    public void setPhone(String phone) {
        manager.setPhone(phone);
    }

    public String getEmail() {
        return manager.getEmail();
    }

    public void setEmail(String email) {
        manager.setEmail(email);
    }

    public Date getTime_create_acc() {
        return manager.getTime_create_acc();
    }

    public void setTime_create_acc(Date time_create_acc) {
        manager.setTime_create_acc(time_create_acc);
    }

    public String getRole() {
        return roles.getRole();
    }

    public void setRole(String role) {
        roles.setRole(role);
    }

    public String getManager_username() {
        return roles.getManager_username();
    }

    public void setManager_username(String manager_username) {
        roles.setManager_username(manager_username);
    }

    public String getType_topic() {
        return roles.getType_topic();
    }

    public void setType_topic(String type_topic) {
        roles.setType_topic(type_topic);
    }

    public Date getTime_create_mission() {
        return roles.getTime_create_mission();
    }

    public void setTime_create_mission(Date time_create_mission) {
        roles.setTime_create_mission(time_create_mission);
    }

}

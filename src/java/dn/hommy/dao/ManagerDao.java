//manager + roles
package dn.hommy.dao;

import dn.hommy.connect.ConnectionFactory;
import dn.hommy.entity.Manager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ManagerDao {

    public ManagerDao() {
    }

    //create new manager full
    public boolean createNewManagerFullDao(String username, String password, String firstname, String lastname,
            String city, String avatar, String gender, String phone, String email, Date time_create_acc) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "INSERT INTO manager (username, password, firstname, lastname, city, avatar, gender, phone, email, time_creat_acc) "
                    + "VALUES ('" + username + "','" + password + "','" + firstname + "','" + lastname + "','" + city + "','"
                    + avatar + "','" + gender + "','" + phone + "','" + email + "','" + toStringDateTime(time_create_acc) + "')";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                return ps.executeUpdate() > 0;
            }
        }
    }

    //create new manager short
    public boolean createNewManagerShortDao(String username, String password, Date time_create_acc) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "INSERT INTO manager (username, password, time_create_acc) " + "VALUES ('" + username + "','" + password + "','" + toStringDateTime(time_create_acc) + "')";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                return ps.executeUpdate() > 0;
            }
        }
    }
    
    //creat new roles
    public boolean createNewRolesDao(String manager_username, String role, String type_topic, Date time_create_mission) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "INSERT INTO roles (manager_username, role, type_topic, time_create_mission) "
                    + "VALUES ('" + manager_username + "','" + role + "','" + type_topic + "','" + toStringDateTime(time_create_mission) + "')";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                return ps.executeUpdate() > 0;
            }
        }
    }
    
    //update roles
    public boolean updateRolesDao(String manager_username, String role, String type_topic, Date time_create_mission) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "UPDATE roles SET role = '" + role + "', type_topic = '" + type_topic 
                    + "', time_create_mission = '" + toStringDateTime(time_create_mission) + "' WHERE manager_username = '" + manager_username + "'";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                return ps.executeUpdate() > 0;
            }
        }
    }
    
    //update personal manager
    public boolean updateManagerDao(String username, String firstname, String lastname,
            String city, String avatar, String gender, String phone, String email, Date time_create_acc) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "UPDATE manager SET firstname = '" + firstname + "', lastname = '" + lastname + "', city = '" + city 
                    + "', avatar = '" + avatar + "', gender = '" + gender + "', phone = '" + phone 
                    + "',email = '" + email + "',time_create_acc'" + toStringDateTime(time_create_acc) + "' WHERE username = '" + username + "'";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                return ps.executeUpdate() > 0;
            }
        }
    }
    
    //update mission for mod
    public boolean updateMissionForModDao(String username, String type_topic, Date time_create_mission) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "UPDATE roles SET type_topic = '" + type_topic
                    + "', time_create_mission = '" + toStringDateTime(time_create_mission)
                    + "' WHERE username = '" + username + "'";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                return ps.executeUpdate() > 0;
            }
        }
    }
    
    //find manager by username
     public Manager findManagerByUsernameDao(String username) throws SQLException,
            ClassNotFoundException, InstantiationException, IllegalAccessException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "SELECT * FROM manager WHERE username = '" + username + "'";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                Manager entity = new Manager();
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    entity.setUsername(rs.getString("username"));
                    entity.setPassword(rs.getString("password"));
                    entity.setFirstname(rs.getString("firstname"));
                    entity.setLastname(rs.getString("lastname"));
                    entity.setGender(rs.getString("gender"));
                    entity.setAvatar(rs.getString("avatar"));
                    entity.setCity(rs.getString("city"));
                    entity.setPhone(rs.getString("phone"));
                    entity.setEmail(rs.getString("email"));
                }
                return entity;
            }
        }
    }
     
     //find all mods
     public ArrayList<Manager> findAllModsDao() throws SQLException,
            ClassNotFoundException, InstantiationException, IllegalAccessException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "SELECT m.* FROM manager m, roles r WHERE m.username = r.manager_username "
                    + "AND r.role LIKE Moderator";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ArrayList<Manager> list = new ArrayList<>();
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Manager entity = new Manager();
                    entity.setUsername(rs.getString("username"));
                    entity.setPassword(rs.getString("password"));
                    entity.setFirstname(rs.getString("firstname"));
                    entity.setLastname(rs.getString("lastname"));
                    entity.setGender(rs.getString("gender"));
                    entity.setAvatar(rs.getString("avatar"));
                    entity.setCity(rs.getString("city"));
                    entity.setPhone(rs.getString("phone"));
                    entity.setEmail(rs.getString("email"));
                    list.add(entity);
                }
                return list;
            }
        }
    }
     
     //find mods by type_topic
      public ArrayList<Manager> findModsByTypeTopicDao(String type_topic) throws SQLException,
            ClassNotFoundException, InstantiationException, IllegalAccessException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "SELECT m.* FROM manager m, roles r WHERE m.username = r.manager_username "
                    + "AND r.role LIKE Moderator AND r.type_topic = '" + type_topic + "'";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ArrayList<Manager> list = new ArrayList<>();
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Manager entity = new Manager();
                    entity.setUsername(rs.getString("username"));
                    entity.setPassword(rs.getString("password"));
                    entity.setFirstname(rs.getString("firstname"));
                    entity.setLastname(rs.getString("lastname"));
                    entity.setGender(rs.getString("gender"));
                    entity.setAvatar(rs.getString("avatar"));
                    entity.setCity(rs.getString("city"));
                    entity.setPhone(rs.getString("phone"));
                    entity.setEmail(rs.getString("email"));
                    list.add(entity);
                }
                return list;
            }
        }
    }
    
    
    //format
    public String toStringDateTime(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

}

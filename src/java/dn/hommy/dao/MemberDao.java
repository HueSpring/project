//member + clock
package dn.hommy.dao;

import dn.hommy.connect.ConnectionFactory;
import dn.hommy.entity.Clock;
import dn.hommy.entity.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MemberDao {

    public MemberDao() {
    }

    //create new
    public boolean createNewMemberDao(String username, String password, String firstname, String lastname,
            String city, String avatar, String gender, String phone, String email, Date time_create_acc) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "INSERT INTO member (username, password, firstname, lastname, city, avatar, gender, phone, email, time_creat_acc) "
                    + "VALUES ('" + username + "','" + password + "','" + firstname + "','" + lastname + "','" + city + "','"
                    + avatar + "','" + gender + "','" + phone + "','" + email + "','" + toStringDateTime(time_create_acc) + "')";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                return ps.executeUpdate() > 0;
            }
        }
    }

    //create clock
    public boolean createClockDao(String username, Date time_current, int step) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "INSERT INTO clock (username, time_current, step) "
                    + "VALUES ('" + username + toStringDateTime(time_current) + "','" + step + "')";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                return ps.executeUpdate() > 0;
            }
        }
    }

    //delete member
    public boolean deleteMemberDao(String username) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "DELETE FROM member WHERE username = '" + username + "'";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                return ps.executeUpdate() > 0;
            }
        }
    }

    //delete clock
    public boolean deleteClockDao(String username) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "DELETE FROM clock WHERE username = '" + username + "'";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                return ps.executeUpdate() > 0;
            }
        }
    }

    //change password
    public boolean updatePasswordMemberDao(String username, String password) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "UPDATE member SET password = '" + password + "' WHERE username = '" + username + "'";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                return ps.executeUpdate() > 0;
            }
        }
    }

    //update personal information
    public boolean updateInformationMemberDao(String username, String firstname, String lastname,
            String city, String gender, String phone, String email) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "UPDATE member SET firstname = '" + firstname + "',lastname = '" + lastname + "',gender = '" + gender
                    + "',city = '" + city + "',phone = '" + phone
                    + "',email = '" + email + "' WHERE username = '" + username + "'";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                return ps.executeUpdate() > 0;
            }
        }
    }

    //find all members
    public ArrayList<Member> findAllMembersDao() throws SQLException,
            ClassNotFoundException, InstantiationException, IllegalAccessException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "SELECT * FROM member";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ArrayList<Member> list = new ArrayList<>();
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Member entity = new Member();
                    entity.setUsername(rs.getString("username"));
                    entity.setPassword(rs.getString("password"));
                    entity.setFirstname(rs.getString("firstname"));
                    entity.setLastname(rs.getString("lastname"));
                    entity.setGender(rs.getString("gender"));
                    entity.setAvatar(rs.getString("avatar"));
                    entity.setCity(rs.getString("city"));
                    entity.setPhone(rs.getString("phone"));
                    entity.setEmail(rs.getString("email"));
                    entity.setTime_create_acc(rs.getDate("time_create_acc"));
                    list.add(entity);
                }
                return list;
            }
        }
    }

    //find member by username
    public Member findMemberByUsernameDao(String username) throws SQLException,
            ClassNotFoundException, InstantiationException, IllegalAccessException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "SELECT * FROM member WHERE username = '" + username + "'";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                Member entity = new Member();
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
                    entity.setTime_create_acc(rs.getDate("time_create_acc"));
                }
                return entity;
            }
        }
    }

    //find clocks by member_username
    public ArrayList<Clock> findClocksByUsernameDao(String member_username) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "SELECT * FROM clock WHERE member_username = '" + member_username + "'";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                ArrayList<Clock> list = new ArrayList<>();
                while (rs.next()) {
                    Clock entity = new Clock();
                    entity.setMember_username(rs.getString("username"));
                    entity.setTime_current(rs.getDate("time_current"));
                    entity.setStep(rs.getInt("step"));
                    list.add(entity);
                }
                return list;
            }
        }
    }

    //find all clocks
    public ArrayList<Clock> findAllClocksDao() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "SELECT * FROM clock";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                ArrayList<Clock> list = new ArrayList<>();
                while (rs.next()) {
                    Clock entity = new Clock();
                    entity.setMember_username(rs.getString("username"));
                    entity.setTime_current(rs.getDate("time_current"));
                    entity.setStep(rs.getInt("step"));
                    list.add(entity);
                }
                return list;
            }
        }
    }

    //find members by city
    public ArrayList<Member> findMembersByCityDao(String city) throws SQLException,
            ClassNotFoundException, InstantiationException, IllegalAccessException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "SELECT * FROM member WHERE city = '" + city + "'";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ArrayList<Member> list = new ArrayList<>();
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Member entity = new Member();
                    entity.setUsername(rs.getString("username"));
                    entity.setPassword(rs.getString("password"));
                    entity.setFirstname(rs.getString("firstname"));
                    entity.setLastname(rs.getString("lastname"));
                    entity.setGender(rs.getString("gender"));
                    entity.setAvatar(rs.getString("avatar"));
                    entity.setCity(rs.getString("city"));
                    entity.setPhone(rs.getString("phone"));
                    entity.setEmail(rs.getString("email"));
                    entity.setTime_create_acc(rs.getDate("time_create_acc"));
                    list.add(entity);
                }
                return list;
            }
        }
    }

    //count all quantity members
    public int countQuantityMember() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "SELECT COUNT(username) FROM member";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                int quantity = 0;
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    quantity = rs.getInt("COUNT(username");
                }
                return quantity;
            }
        }
    }

    //count quantity member by month & year
    public int countQuantityMemberByTime(int month, int year) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        try (Connection conn = ConnectionFactory.getConnection()) {
            String begin = year + "-" + month + "-01";
            String end = year + "-" + month + "31";
            String sql = "SELECT COUNT(username) FROM member WHERE time_create_acc >= '" + begin 
                    + "' AND time_create_acc <= '" + end + "'";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                int quantity = 0;
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    quantity = rs.getInt("COUNT(username");
                }
                return quantity;
            }
        }
    }
    
    //format
    public String toStringDateTime(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
    
    //split datetime
    public String[] splitDateTime(Date date){
        String string = toStringDateTime(date);
        String[] s1 = string.split(" ");
        String[] s2 = s1[1].split("-");
        return s2;
    }

}

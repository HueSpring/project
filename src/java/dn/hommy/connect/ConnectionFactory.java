
package dn.hommy.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hommydb?" +
                                   "user=root&password=1234");
        return conn;
    }
    
    
}

package utils;

import java.sql.*;

public class DBConnection {
    private static Connection con = null;

    public static Connection getConnection() {
        if(con != null) return con;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mvc_db", "root", "password"
            );
        } catch(Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}

package Jframe;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConection {

    static Connection con = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/library_ms?useSSL=false&serverTimezone=UTC",
                "root",
                ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    // ✔ main method MUST be inside the class
    public static void main(String[] args) {
        Connection c = DBConection.getConnection();
        if (c != null) {
            System.out.println("Connection successful!");
        } else {
            System.out.println("Connection failed!");
        }
    }
}

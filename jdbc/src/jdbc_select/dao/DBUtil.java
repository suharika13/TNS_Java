package jdbc_select.dao;

import java.sql.*;
import javax.sql.*;

public class DBUtil {

    private static Connection con;
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Krishnavenu@16";
    private static final String URL = "jdbc:mysql://localhost:3306/tns";

    // Method to get connection
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            System.out.println("Driver loaded successfully");

            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection established successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    // Optional: main() to test connection
    public static void main(String[] args) {
        getConnection();
    }
}
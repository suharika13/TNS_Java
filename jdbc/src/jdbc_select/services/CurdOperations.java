package jdbc_select.services;

import java.sql.*;
import jdbc_select.dao.DBUtil;

public class CurdOperations {
    static Connection con;
    static PreparedStatement pst;
    static ResultSet rs;

    static {
        con = DBUtil.getConnection();
        if (con != null) {
            System.out.println("Connection is success");
        } else {
            System.out.println("Connection failed");
        }
    }

    // Method to display all cars
    public static void displayCars() {
        try {
            pst = con.prepareStatement("SELECT * FROM car");
            rs = pst.executeQuery();
            System.out.println("Car Details:");
            System.out.println("CID\tCNAME");
            System.out.println("--------------------");
            while (rs.next()) {
                int cid = rs.getInt("cid");
                String cname = rs.getString("cname");
                System.out.println(cid + "\t" + cname);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

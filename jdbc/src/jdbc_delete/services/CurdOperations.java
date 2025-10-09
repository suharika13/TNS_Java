package jdbc_delete.services;

import java.sql.*;
import javax.sql.*;
import jdbc_delete.dao.DBUtil;

public class CurdOperations {
    static Connection con;
    static PreparedStatement pst;

    static {
        con = DBUtil.getConnection();
        if (con != null) {
            System.out.println("Connection is successful");
        }
    }

    // Method to delete a car record by car ID
    public static int deleteCar(int cid) {
        int n = 0;
        try {
            pst = con.prepareStatement("DELETE FROM car WHERE cid = ?");
            pst.setInt(1, cid);
            n = pst.executeUpdate();
            if (n > 0) {
                System.out.println("Car with ID " + cid + " deleted successfully.");
            } else {
                System.out.println("No car found with ID " + cid);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }
}

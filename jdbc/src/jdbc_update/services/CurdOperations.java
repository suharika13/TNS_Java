package jdbc_update.services;

import java.sql.*;
import javax.sql.*;
import jdbc_update.dao.DBUtil;

public class CurdOperations {
    static Connection con;
    static PreparedStatement pst;

    static {
        con = DBUtil.getConnection();
        if (con != null) {
            System.out.println("Connection is success");
        }
    }

    // Method to update car name based on car id
    public static int updateCar(int cid, String newName) {
        int n = 0;
        try {
            pst = con.prepareStatement("UPDATE car SET cname = ? WHERE cid = ?");
            pst.setString(1, newName);
            pst.setInt(2, cid);
            n = pst.executeUpdate();
            if (n > 0)
                System.out.println("Record updated successfully for Car ID: " + cid);
            else
                System.out.println("No record found with Car ID: " + cid);
        } catch (Exception e) {
            System.out.println(e);
        }
        return n;
    }
}

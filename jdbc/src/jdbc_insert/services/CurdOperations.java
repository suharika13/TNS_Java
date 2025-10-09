package jdbc_insert.services;

import java.sql.*;
import javax.sql.*;
import jdbc_insert.dao.DBUtil;

public class CurdOperations {
	static Connection con;
	static PreparedStatement pst;
	
	static {
		con=DBUtil.getConnection();
		if(con!=null)
		{
			System.out.println("connection is success");
		}
	}
	
	//created the table now we have to add the values to table
	public static int addStudent(int sid,String sname)
	{
		int n=0;
		try {
			pst = con.prepareStatement("INSERT INTO car VALUES(?,?)");
			pst.setInt(1, sid);
			pst.setString(2, sname);
			pst.executeUpdate();
		}catch(Exception e)
		{
			
		}
		return n;
	}
	
	
}
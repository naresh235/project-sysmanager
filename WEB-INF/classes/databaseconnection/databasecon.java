package databaseconnection;
import java.sql.*;

public class databasecon
{
	static Connection con;
	public static Connection getconnection()
	{
 		
 			
		try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			con = DriverManager.getConnection("jdbc:mysql://test-db.clefklijbsna.ap-south-1.rds.amazonaws.com:3306/sys_manag","sysuser","b98eLkdGWz2dFGmmnbbzxq");
		}
		catch(Exception e)
		{
			System.out.println("class error");
		}
		return con;
	}
	
}

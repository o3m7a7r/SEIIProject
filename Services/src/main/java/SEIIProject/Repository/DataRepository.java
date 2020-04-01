package SEIIProject.Repository;

import java.sql.*;

public class DataRepository {
	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	
	public DataRepository()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/name of the data base", "root", "");
			st = con.createStatement();
			
			
		}catch(Exception e) 
		{
			System.out.println("error : " + e);
		}
	}
	
}

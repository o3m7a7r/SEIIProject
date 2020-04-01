package SEIIProject.Repository;

import java.util.ArrayList;

import SEIIProject.Model.AbstractUser;

public class UserLoader implements Loader{
	public ArrayList<AbstractUser> loadALL()
	{
		String query;
		DataRepository dr = new DataRepository(); 
		ArrayList<AbstractUser> au = new ArrayList();
		AbstractUser u = null;
		try 
		{
			
			query = "SELECT * FROM Users";
			dr.rs = dr.st.executeQuery(query);
			//System.out.println("records from the database : ");
			
			while(dr.rs.next())
			{
				String fName = dr.rs.getString("firstName");
				String lName = dr.rs.getString("lastName");
				String uName = dr.rs.getString("userName");
				String pass = dr.rs.getString("password");
				String email = dr.rs.getString("email");
				u.setFirstName(fName);
				u.setLastName(lName);
				u.setPassword(pass);
				u.setUserName(uName);
				u.setEmail(email);
				au.add(u);
			}
			
		}catch(Exception e)
		{
			System.out.println("error : " + e);
		}
		return au;
	}
}

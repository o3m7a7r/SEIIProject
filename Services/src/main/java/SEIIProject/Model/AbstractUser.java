package SEIIProject.Model;

import SEIIProject.Repository.DataRepository;

public abstract class AbstractUser {
	
	String firstName;
	String lastName;
	String userName;
	String password;
	String email;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public AbstractUser(String firstName, String lastName,String userName, String password, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public AbstractUser() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		String result = "Welcome" +' ' + firstName + ' ' + lastName + '!';
		return result;
	}

	public void saveToDatabase() {
		DataRepository dr = new DataRepository();
		String query = "INSERT INTO 'Users' ('firstName', 'lastName', 'userName', 'password', 'email') VALUES"
				+ "'" + getFirstName() + "'" + getLastName() + "'" + getUserName() + "'" + getPassword() + "'" + getEmail() + "')";
		try
		{
			dr.rs = dr.st.executeQuery(query);
		}catch(Exception e){
			System.out.println("error : " + e);
		}
	}
}

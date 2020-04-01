package SEIIProject.Model;

public class Administrator extends AbstractUser {

	public Administrator(String firstName, String lastName,String userName, String password, String email) {
		super(firstName, lastName,userName, password, email);
		
	}

	public Administrator() {
		super();
	}

	@Override
	public void saveToDatabase() {
		// TODO Auto-generated method stub
		
	}

}

package SEIIProject.Model;

public class Buyer extends AbstractUser {

	public Buyer(String firstName, String lastName,String userName, String password, String email) {
		super(firstName, lastName,userName, password, email);
		
	}

	public Buyer() {
		super();
	}

	@Override
	public void saveToDatabase() {
		System.out.println("dfsdfsdf");
	}

}

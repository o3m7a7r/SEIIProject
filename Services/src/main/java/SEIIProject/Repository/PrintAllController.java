package SEIIProject.Repository;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SEIIProject.Model.AbstractUser;

@RestController
public class PrintAllController {
	private String query;
	
	DataRepository dr = new DataRepository();
	
	
	public PrintAllController() {
		query = null;
	}
	
	@RequestMapping("/printAll")
	public ArrayList<AbstractUser> printAll() {
		Loader l = new UserLoader();
		//ArrayList<AbstractUser> au = new ArrayList();
		//AbstractUser u = null;
		return l.loadALL();
	}
}

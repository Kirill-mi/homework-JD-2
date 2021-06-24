package by.htp.secondpr.model;
import java.util.ArrayList;
import java.util.List;

import by.htp.secondpr.user.User;

public class Model {
	private static Model instance = new Model();

    private List<User> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new ArrayList<>();
    }

    public String createUser(String name, String pass, String pass1) {
    	if (!pass.equals(pass1)) {
    		return "Password is inncorected";
    	}
    	if (name.isEmpty()) {
			return "Enter name";
		}
		if (pass.isEmpty()) {
			return "Enter password";
		}
		model.add(new User(name, pass));
		return "User added";
	}
    
    public boolean validateUser(String name, String pass) {
    		for (User user : model) {
			if (user.getName().equals(name) && user.getPass().equals(pass)) {
				return true;
			}
		}
		return false;
	}
}

package by.htp.secondpr.user;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
	
	    private String name;
	    private String pass;
	    Set<User> users = new HashSet<>();

	    public User() {
	    }

	    public User(String name, String pass) {
	        this.name = name;
	        this.pass = pass;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getPass() {
	        return pass;
	    }

	    public void setPass(String pass) {
	        this.pass = pass;
	    }

	    public String createUser(String name, String pass) {
	    	if(name.isEmpty()) {
	    		return "Enter name";
	    	}
	    	if(pass.isEmpty()) {
	    		return "Enter password";
	    	}
	        users.add(new User(name, pass));
	        return "User added";
	    }

	    public boolean validateUser(String name, String pass) {
	        for (User user : users) {
	            if (user.getName().equals(name) && user.getPass().equals(pass)) {
	                return true;
	            }
	        }
	        return false;
	    }
	}


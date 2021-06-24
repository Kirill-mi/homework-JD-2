package by.htp.secondpr.user;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String name;
	private String pass;
	List<User> users = new ArrayList<>();

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

}

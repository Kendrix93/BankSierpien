package data.holder;

import java.util.ArrayList;

import data.model.people.Admin;
import data.model.people.User;

public class PeopleHolder {
	
	private ArrayList<User> user = new ArrayList<User>();
	private ArrayList<Admin> admin = new ArrayList<Admin>();
	
	
	public ArrayList<User> getUser() {
		return user;
	}
	public void setUser(ArrayList<User> user) {
		this.user = user;
	}
	public ArrayList<Admin> getAdmin() {
		return admin;
	}
	public void setAdmin(ArrayList<Admin> admin) {
		this.admin = admin;
	}
	
	
	
	

}

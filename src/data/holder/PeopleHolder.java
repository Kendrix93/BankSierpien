package data.holder;

import java.util.ArrayList;

import data.model.people.Admin;
import data.model.people.User;

public class PeopleHolder {
	
	private static ArrayList<User> user = new ArrayList<User>();
	private static ArrayList<Admin> admin = new ArrayList<Admin>();
	
	
	public static ArrayList<User> getUser() {
		return user;
	}
	public static void setUser(ArrayList<User> user) {
		PeopleHolder.user = user;
	}
	public static ArrayList<Admin> getAdmin() {
		return admin;
	}
	public static void setAdmin(ArrayList<Admin> admin) {
		PeopleHolder.admin = admin;
	}
	

	
	
	
	

}

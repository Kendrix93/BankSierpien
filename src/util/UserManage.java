package util;

import java.util.ArrayList;
import java.util.Scanner;

import data.holder.PeopleHolder;
import data.model.people.User;

public class UserManage {
	
	private static ArrayList<User> user = PeopleHolder.getUser();
	
	private static Scanner in = new Scanner(System.in);
	
	public static void addUser() {
		
		
		String name, surname, login, password;
		int age;
		
		System.out.println("Name");
		name = in.next();
		System.out.println("Surname");
		surname = in.next();
		System.out.println("Age");
		age = in.nextInt();
		System.out.println("Login");
		login = in.next();
		System.out.println("passrowd");
		password = in.next();
		
		user.add(new User(1, name, surname, age, login, password));
		
		System.out.println("DONE");
		
	}
	
	public static void deleteUser() {
		
		System.out.println("UsedID to delete user");
		int userID = in.nextInt();
		
		for(User u: user) {
			if (userID == u.getUserID()) {
				user.remove(u);
			}
		}
	}
	
	public static void showUsers() {
		for (User u: user) {
			System.out.println(u);
		}
		
	}

}

package util;

import java.util.ArrayList;
import java.util.Scanner;

import data.holder.PeopleHolder;
import data.model.people.Admin;
import data.model.people.User;
import main.MainController;

public class Login {
	
	private static ArrayList<Admin> admin = PeopleHolder.getAdmin();
	private static ArrayList<User> user = PeopleHolder.getUser();
	
	private static Scanner in = new Scanner(System.in);

	
	public static void LoginPanel() {
		
		System.out.println("To what type of account you want to log in?");
		System.out.println("1.User");
		System.out.println("2.Admin");
		System.out.println("0. Exit");
		int number = in.nextInt();
		
		if(number == 1) {
			System.out.println("Login: ");
			String login = in.next();
			System.out.println("Password: ");
			String password = in.next();
			
			for (User u: user) {
				if(login.equals(u.getLogin())) {
					if(password.equals(u.getPassword()))
						MainController.UserPanel(u.getUserID());
				}
				System.out.println("Try again!");
				LoginPanel();
			}
			
		}else if (number == 2) {
			System.out.println("Login: ");
			String login = in.next();
			System.out.println("Password: ");
			String password = in.next();
			
			for (Admin a: admin) {
				if(login.equals(a.getLogin())) {
					if(password.equals(a.getPassword()))
						MainController.AdminPanel();
				}
				System.out.println("Try again!");
				LoginPanel();
			}
		}else if(number == 0){
			System.exit(0);
			
			
		}else {
			System.out.println("Wrong number");
			LoginPanel();
		}
		
	}
}

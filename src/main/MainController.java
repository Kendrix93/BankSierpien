package main;

import java.util.ArrayList;
import java.util.Scanner;

import data.holder.AccountsHolder;
import data.holder.PeopleHolder;
import data.model.accounts.Account;
import data.model.people.Admin;
import data.model.people.User;

public class MainController {
	
	
	private static ArrayList<Account> account = AccountsHolder.getAccount();
	private static ArrayList<Admin> admin = PeopleHolder.getAdmin();
	private static ArrayList<User> user = PeopleHolder.getUser();
	
	private static Scanner in = new Scanner(System.in);
	
	
	public static void AdminPanel() {
		
		System.out.println("Choose your option:");
		System.out.println("1. Show users");
		System.out.println("2. Show accounts");
		System.out.println("3. Show user accounts");
		System.out.println("4. Add user");
		System.out.println("5. Add account to user");
		System.out.println("6. Detele user's account");
		System.out.println("7. DO SMTHG");
		System.out.println("8. ");
		System.out.println("9. ");
		System.out.println("0. Quit");
		
		
		
	}
	
	public static void UserPanel() {
		
		
	}
}

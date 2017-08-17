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
		
		
	}
	
	public static void UserPanel() {
		
		
	}
}

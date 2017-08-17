package main;

import java.util.ArrayList;
import java.util.Scanner;

import data.holder.AccountsHolder;
import data.holder.PeopleHolder;
import data.model.accounts.Account;
import data.model.people.Admin;
import data.model.people.User;
import util.AccountManage;
import util.UserManage;

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
		System.out.println("5. Add Private account to user");
		System.out.println("6. Add Business account to user");
		System.out.println("7. Detele user's account");
		System.out.println("8. ");
		System.out.println("9. ");
		System.out.println("0. Quit");
		
		int a = in.nextInt();
		
		switch(a){
		case 1:
			UserManage.showUsers();
			break;
		case 2:
			
		case 3:
			
		case 4:
			UserManage.addUser();
			break;
		case 5:
			System.out.println("userID?");
			int userIDprivate = in.nextInt();
			AccountManage.addPrivateAccount(userIDprivate);
			break;
		case 6:
			System.out.println("userID");
			int userIDbusiness = in.nextInt();
			AccountManage.addBusinesAccount(userIDbusiness);
			break;
		case 7:
			UserManage.deleteUser();
			break;
			
			
		}
		
		
		
	}
	
	public static void UserPanel(int userID) {
		
		System.out.println("Choose your option:");
		System.out.println("1. Show your accounts");
		System.out.println("2. Make Private Account");
		System.out.println("3. Make Business Account");
		System.out.println("4. Delete account");
		System.out.println("5. Make a payment");
		System.out.println("6. Make a constant payment on Business Account");
		System.out.println("7. ");
		System.out.println("8. ");
		System.out.println("9. ");
		System.out.println("0. Quit");
		
		
		
		int number = in.nextInt();
		
		if(number == 1) {
			
		}else if (number ==2) {
			AccountManage.addPrivateAccount(userID);
			UserPanel(userID);	
			
		}else if (number ==3) {
			AccountManage.addBusinesAccount(userID);
			UserPanel(userID);
			
		}else if (number ==4) {
			AccountManage.deletaAccount();
			UserPanel(userID);
			
		}else if (number ==5) {
			
		}else if (number ==6) {
			
		}
	}
}

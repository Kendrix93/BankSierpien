package main;


import java.util.Scanner;

import util.AccountManage;
import util.Login;
import util.PaymentManage;
import util.UserManage;

public class MainController {
	

	
	private static Scanner in = new Scanner(System.in);
	
	
	public static void AdminPanel() {
		
		util.SaveToCSV.saveToFileUser();
		util.SaveToCSV.saveToFileAccount();
		util.SaveToCSV.saveToFilePayments();
		
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
			AdminPanel();
		case 2:
			AccountManage.showAccounts();
			AdminPanel();
		case 3:
			System.out.println("UserID?");
			int userID = in.nextInt();
			AccountManage.showUserAccount(userID);
			AdminPanel();
		case 4:
			UserManage.addUser();
			AdminPanel();
		case 5:
			System.out.println("userID?");
			int userIDprivate = in.nextInt();
			AccountManage.addPrivateAccount(userIDprivate);
			AdminPanel();
		case 6:
			System.out.println("userID");
			int userIDbusiness = in.nextInt();
			AccountManage.addBusinesAccount(userIDbusiness);
			AdminPanel();
		case 7:
			UserManage.deleteUser();
			AdminPanel();
		case 0 :
			Login.LoginPanel();
			
		}
		
		
		
	}
	
	public static void UserPanel(int userID) {
		
		util.SaveToCSV.saveToFileUser();
		util.SaveToCSV.saveToFileAccount();
		util.SaveToCSV.saveToFilePayments();
		
		System.out.println("Choose your option:");
		System.out.println("1. Show your accounts");
		System.out.println("2. Make Private Account");
		System.out.println("3. Make Business Account");
		System.out.println("4. Delete account");
		System.out.println("5. Make a payment");
		System.out.println("6. Make a constant payment on Business Account");
		System.out.println("7. Show your constatn payments");
		System.out.println("8. ");
		System.out.println("9. ");
		System.out.println("0. Quit");
		
		
		
		int number = in.nextInt();
		
		if(number == 1) {
			AccountManage.showUserAccount(userID);
			UserPanel(userID);	
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
			PaymentManage.makePayment(userID);
			UserPanel(userID);
			
		}else if (number ==6) {
			PaymentManage.makeConstatnPayment(userID);
			UserPanel(userID);
			
		}else if( number ==7) {
			PaymentManage.showYourConstatnPayments(userID);
			UserPanel(userID);
		}else if ( number == 0) {
			Login.LoginPanel();
		}
	}
}

package util;

import java.util.ArrayList;
import java.util.Scanner;

import data.holder.AccountsHolder;
import data.model.accounts.Account;
import data.model.accounts.BusinessAccount;
import data.model.accounts.PrivateAccount;
import main.MainController;


public class AccountManage {
	
	private static ArrayList<Account> account = AccountsHolder.getAccount();
	
	private static Scanner in = new Scanner(System.in);
	
	public static void addPrivateAccount(int userID) {
		
		System.out.println("How much money you pay to this account");
		double money = in.nextDouble();
		double accountNumber = 0;
		
		account.add(new PrivateAccount("PRIVATE", userID, accountNumber, money));
		
	}
	
	public static void addBusinesAccount(int userID) {
		
		System.out.println("How much money you pay to this account");
		double money = in.nextDouble();
		double accountNumber = 0;
		
		account.add(new BusinessAccount("BUSINESS", userID, accountNumber, money));
		
	}

	public static void deletaAccount(){
		
		System.out.println("Write account number you want to delete");
		double accountNumber = in.nextDouble();
		
		for (Account a: account) {
			if(accountNumber == a.getAccountNumber()) {
				account.remove(a);
				break;
			}
		}
		
	}
	
	public static void showAccounts() {
		for (Account a: account) {
			System.out.println(a);
		}
	}
	
	public static void showUserAccount(int userID) {
		for (Account a: account) {
			if (userID == a.getUserID()) {
				System.out.println(a);
			}
		}
	}
	
	public static void makePayment(int userID) {

		System.out.println("Your account number");
		double accountNumber = in.nextDouble();
		System.out.println("How much money");
		double money = in.nextDouble();
		System.out.println("To what account? Write account number");
		double accountNumber2 = in.nextDouble();

		for (Account a : account) {
			if (a.getAccountNumber() == accountNumber && a.getUserID() == userID) {
				if (a.getMoney() >= money) {
					for (Account aa : account) {
						if (aa.getAccountNumber() == accountNumber2) {
							double money1 = aa.getMoney() + money;
							double money2 = a.getMoney() - money;
							aa.setMoney(money1);
							a.setMoney(money2);
							System.out.println("Payment done");
							MainController.UserPanel(userID);

						}

					}
					System.out.println("Wrong number to pay");
					MainController.UserPanel(userID);
				}else {
				System.out.println("Not enough money");
				MainController.UserPanel(userID);
				}
			}

		}
		System.out.println("This is not your account number");
		MainController.UserPanel(userID);

	}
	
	public static void makeConstatnPayment(int userID) {

		System.out.println("Your account number");
		double accountNumber = in.nextDouble();
		System.out.println("How much money");
		double money = in.nextDouble();
		System.out.println("To what account? Write account number");
		double accountNumber2 = in.nextDouble();
		System.out.println("Day space every payment");
		int days = in.nextInt();

		for (Account a : account) {
			if (a.getAccountNumber() == accountNumber && a.getUserID() == userID && 
					a.getAccountType().equals("BUSINESS")) {
				if (a.getMoney() >= money) {
					for (Account aa : account) {
						if (aa.getAccountNumber() == accountNumber2) {
							double money1 = aa.getMoney() + money;
							double money2 = a.getMoney() - money;
							aa.setMoney(money1);
							a.setMoney(money2);
							System.out.println("Payment done");
							MainController.UserPanel(userID);

						}

					}
					System.out.println("Wrong number to pay");
					MainController.UserPanel(userID);
				}else {
				System.out.println("Not enough money");
				MainController.UserPanel(userID);
				}
			}

		}
		System.out.println("This is not your account number");
		MainController.UserPanel(userID);

	}
	
}

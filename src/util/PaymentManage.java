package util;

import java.util.ArrayList;
import java.util.Scanner;

import data.holder.AccountsHolder;
import data.holder.PaymentHolder;
import data.model.accounts.Account;
import data.model.payment.Payment;
import main.MainController;

public class PaymentManage {
	
	private static ArrayList<Account> account = AccountsHolder.getAccount();
	private static ArrayList<Payment> payment = PaymentHolder.getPayment();
	
	private static Scanner in = new Scanner(System.in);
	
	
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
							payment.add(new Payment(userID, accountNumber, accountNumber2,
									money, days));
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

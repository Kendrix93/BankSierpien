package util;

import java.util.ArrayList;
import java.util.Scanner;

import data.holder.AccountsHolder;
import data.model.accounts.Account;
import data.model.accounts.BusinessAccount;
import data.model.accounts.PrivateAccount;


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
			}
		}
		
	}
	
	
}

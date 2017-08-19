package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import data.holder.AccountsHolder;
import data.holder.PaymentHolder;
import data.holder.PeopleHolder;
import data.model.accounts.Account;
import data.model.accounts.BusinessAccount;
import data.model.accounts.PrivateAccount;
import data.model.payment.Payment;
import data.model.people.User;

public class ReadFromSCV {
	
	private static ArrayList<Account> account = AccountsHolder.getAccount();
	private static ArrayList<User> user = PeopleHolder.getUser();
	private static ArrayList<Payment> payment = PaymentHolder.getPayment();
	
	static String filename1 = "Users.csv";
	static String filename2 = "Accounts.csv";
	static String filename3 = "Payments.csv";
	
	
	public static ArrayList<User> readFromFileUser(){
		
		Path path = Paths.get(filename1);
		ArrayList<String> read = new ArrayList<String>();
		try {
			read = (ArrayList<String>) Files.readAllLines(path);
		} catch (IOException ex) {
			System.out.println("There is no file Users");
		}
		ArrayList<User> user = toObject(read);
		return user;
		
	}
	
	public static ArrayList<User> toObject(ArrayList<String> read) {
		
		for(String line : read) {
			String [] l = line.split(";");
			User users = new User(Integer.parseInt(l[0]), l[1], l[2], 
					Integer.parseInt(l[3]), l[4], l[5]);
			user.add(users);
		}
		return user;
	}
	
	
	public static ArrayList<Account> readFromFileAccount(){
		
		Path path = Paths.get(filename2);
		ArrayList<String> read = new ArrayList<String>();
		try {
			read = (ArrayList<String>) Files.readAllLines(path);
		} catch (IOException ex) {
			System.out.println("There is no file Accounts");
		}
		ArrayList<Account> account = toObject1(read);
		return account;
		
	}
	
	public static ArrayList<Account> toObject1(ArrayList<String> read) {
		
		for(String line : read) {
			String [] l = line.split(";");
			if (l[0].equals("BUSINESS")) {
				Account accounts = new BusinessAccount(l[0], Integer.parseInt(l[1]), 
						Double.parseDouble(l[2]), Double.parseDouble(l[3]));
				account.add(accounts);
			}else if (l[0].equals("PRIVATE")) {
			Account accounts = new PrivateAccount(l[0], Integer.parseInt(l[1]), 
					Double.parseDouble(l[2]), Double.parseDouble(l[3]));
			account.add(accounts);
			}
		}
		return account;
	}
	
	
	public static ArrayList<Payment> readFromFilePayments(){
		
		Path path = Paths.get(filename3);
		ArrayList<String> read = new ArrayList<String>();
		try {
			read = (ArrayList<String>) Files.readAllLines(path);
		} catch (IOException ex) {
			System.out.println("There is no file Payment");
		}
		ArrayList<Payment> payment = toObject2(read);
		return payment;
		
	}
	
	public static ArrayList<Payment> toObject2(ArrayList<String> read) {
		
		for(String line : read) {
			String [] l = line.split(";");
			Payment payments = new Payment(Integer.parseInt(l[0]), Double.parseDouble(l[1]),
					Double.parseDouble(l[2]), Double.parseDouble(l[3]), Integer.parseInt(l[4]));
			payment.add(payments);
		}
		return payment;
	}
	
	

}


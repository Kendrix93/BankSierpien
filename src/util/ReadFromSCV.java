package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import data.holder.AccountsHolder;
import data.holder.PeopleHolder;
import data.model.accounts.Account;
import data.model.accounts.BusinessAccount;
import data.model.accounts.PrivateAccount;
import data.model.people.User;

public class ReadFromSCV {
	
	private static ArrayList<Account> account = AccountsHolder.getAccount();
	private static ArrayList<User> user = PeopleHolder.getUser();
	
	static String filename1 = "Users.csv";
	static String filename2 = "Accounts.csv";
	
	
	
	public static ArrayList<User> readFromFileUser(){
		
		Path path = Paths.get(filename1);
		ArrayList<String> read = new ArrayList<String>();
		try {
			read = (ArrayList<String>) Files.readAllLines(path);
		} catch (IOException ex) {
			System.out.println("There is no file");
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
			System.out.println("There is no file");
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
	

}


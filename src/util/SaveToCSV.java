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
import data.model.payment.Payment;
import data.model.people.User;

public class SaveToCSV {
	
	private static ArrayList<Account> account = AccountsHolder.getAccount();
	private static ArrayList<User> user = PeopleHolder.getUser();
	private static ArrayList<Payment> payment = PaymentHolder.getPayment();
	
	static String filename1 = "Users.csv";
	static String filename2 = "Accounts.csv";
	static String filename3 = "Payments.csv";
	
	
	public static void saveToFileUser() {
		
		Path path = Paths.get(filename1);
		ArrayList<String> out = new ArrayList<>();
		for (User u: user) {
			out.add(u.toFile(";"));
		}try {
			Files.write(path, out);
		}catch (IOException ex){
			System.out.println("Cant save file user");
		}
		
		System.out.println("Done save to file User");
		
	}
	
	
	public static void saveToFileAccount() {
		
		Path path = Paths.get(filename2);
		ArrayList<String> out = new ArrayList<>();
		for (Account a: account) {
			out.add(a.toFile(";"));
		}try {
			Files.write(path, out);
		}catch (IOException ex) {
			System.out.println("Cant write to file Accounts");
		}
		
		System.out.println("Done write to file Accounts");	
	}
	
	public static void saveToFilePayments() {
		
		Path path = Paths.get(filename3);
		ArrayList<String> out = new ArrayList<>();
		for (Payment p: payment) {
			out.add(p.toFile(";"));
		}try {
			Files.write(path, out);
		}catch (IOException ex) {
			System.out.println("Cant write to file Accounts");
		}
		
		System.out.println("Done write to file Accounts");	
	}
	

}

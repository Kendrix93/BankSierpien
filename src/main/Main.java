package main;

import java.util.ArrayList;

import data.holder.PeopleHolder;
import data.model.people.Admin;
import util.Login;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//	ArrayList<Account> account = AccountsHolder.getAccount();
		ArrayList<Admin> admin = PeopleHolder.getAdmin();
	//	ArrayList<User> user = PeopleHolder.getUser();
		
		admin.add(new Admin(1,"Patryk", "Kedra", 24, "pk", "pk"));
		
		
		util.ReadFromSCV.readFromFileUser();
		util.ReadFromSCV.readFromFileAccount();
		Login.LoginPanel();
	}

}

package data.holder;

import java.util.ArrayList;

import data.model.accounts.Account;

public class AccountsHolder {
	
	private static ArrayList<Account> account = new ArrayList<Account>();

	public static ArrayList<Account> getAccount() {
		return account;
	}

	public static void setAccount(ArrayList<Account> account) {
		AccountsHolder.account = account;
	}


	
}

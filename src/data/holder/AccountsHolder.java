package data.holder;

import java.util.ArrayList;

import data.model.accounts.Account;

public class AccountsHolder {
	
	private ArrayList<Account> account = new ArrayList<Account>();

	public ArrayList<Account> getAccount() {
		return account;
	}

	public void setAccount(ArrayList<Account> account) {
		this.account = account;
	}
	
	
}

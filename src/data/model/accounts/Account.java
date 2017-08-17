package data.model.accounts;

public abstract class Account {

	
	private String accountType;
	private int userID;
	private double accountNumber;
	
	public Account (String accountType, int userID, double accountNumber) {
		
		this.accountType = accountType;
		this.userID = userID;
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	
}

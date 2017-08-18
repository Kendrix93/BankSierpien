package data.model.accounts;

public abstract class Account {

	
	private String accountType;
	private int userID;
	private final double accountNumber; // unique
	private double money;
	private static int count = 1000000;
	
	public Account (String accountType, int userID, double accountNumber, double money) {
		
		this.accountType = accountType;
		this.userID = userID;
		this.money = money;
		
	    if(accountNumber > 0) {
	        this.accountNumber = accountNumber;
	        ++count;
	      } else {
	    	  count = count + 11;
	        this.accountNumber = count;
	      }
		
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
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



	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Account.count = count;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accountNumber);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
		temp = Double.doubleToLongBits(money);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + userID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (Double.doubleToLongBits(accountNumber) != Double.doubleToLongBits(other.accountNumber))
			return false;
		if (accountType == null) {
			if (other.accountType != null)
				return false;
		} else if (!accountType.equals(other.accountType))
			return false;
		if (Double.doubleToLongBits(money) != Double.doubleToLongBits(other.money))
			return false;
		if (userID != other.userID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [accountType=" + accountType + ", userID=" + userID + ", accountNumber=" + accountNumber
				+ ", money=" + money + "]";
	}

	public String toFile(String separator) {
		// TODO Auto-generated method stub
		return getAccountType() + separator + getUserID() + separator + getAccountNumber() +
				separator + getMoney();
	}
	
	
	
}

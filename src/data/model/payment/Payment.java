package data.model.payment;

public class Payment {
	
	private int userID;
	private double accountNumber1;
	private double accountNumber2;
	private double money;
	private int days;

	
	public Payment(int userID, double accountNumber1, double accountNumber2, 
			double money, int days) {
		
		this.userID = userID;
		this.accountNumber1 = accountNumber1;
		this.accountNumber2 = accountNumber2;
		this.money = money;
		this.days = days;
		
	}


	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
	}


	public double getAccountNumber1() {
		return accountNumber1;
	}


	public void setAccountNumber1(double accountNumber1) {
		this.accountNumber1 = accountNumber1;
	}


	public double getAccountNumber2() {
		return accountNumber2;
	}


	public void setAccountNumber2(double accountNumber2) {
		this.accountNumber2 = accountNumber2;
	}


	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		this.money = money;
	}


	public int getDays() {
		return days;
	}


	public void setDays(int days) {
		this.days = days;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accountNumber1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(accountNumber2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + days;
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
		Payment other = (Payment) obj;
		if (Double.doubleToLongBits(accountNumber1) != Double.doubleToLongBits(other.accountNumber1))
			return false;
		if (Double.doubleToLongBits(accountNumber2) != Double.doubleToLongBits(other.accountNumber2))
			return false;
		if (days != other.days)
			return false;
		if (Double.doubleToLongBits(money) != Double.doubleToLongBits(other.money))
			return false;
		if (userID != other.userID)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Payment [userID=" + userID + ", accountNumber1=" + accountNumber1 + ", accountNumber2=" + accountNumber2
				+ ", money=" + money + ", days=" + days + "]";
	}
	
	
	public String toFile(String separator) {
		return getUserID() + separator + getAccountNumber1() + separator 
				+ getAccountNumber2() + separator + getMoney() + separator + getDays();
		
	}
	
}

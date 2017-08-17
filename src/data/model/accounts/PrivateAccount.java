package data.model.accounts;

public class PrivateAccount extends Account{
	
	private double money;

	public PrivateAccount(String accountType, int userID, double accountNumber, double money) {
		super(accountType, userID, accountNumber);
		
		this.money = money;
		money = 1000;
		
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(money);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrivateAccount other = (PrivateAccount) obj;
		if (Double.doubleToLongBits(money) != Double.doubleToLongBits(other.money))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PrivateAccount [money=" + money + "]";
	}
	
	

}

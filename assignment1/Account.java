package assignment1;

/**
 * 
 * @author yuhsuan huang
 *
 */
public class Account {
	
	private String firstName;
	private String lastName;
	private double balance;
	
	//Constructors
	public Account() {}
	
	public Account(String firstName, String lastName, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}
	
	//Getters and Setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if(firstName.matches("[a-z A-Z_]+")) {
			this.firstName = firstName;
		} else {
			throw new IllegalArgumentException("Invalid character in the first name");
		}
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		if(lastName.matches("[a-z A-Z_]+")) {
			this.lastName = lastName;
		} else {
			throw new IllegalArgumentException("Invalid character in the last name");
		}
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * Deposit Method - Deposit money into account
	 * @param money
	 */
	public void deposit(double money) {
		if (money <= 0 ) {
			throw new IllegalArgumentException("Cannot deposit a negative number"); 
		} else {
			balance += money;
		}
	}
	
	/**
	 * Withdraw Method - Withdraw money from account
	 * @param money
	 */
	public void withdraw(double money) {
		if (money <= 0 ) {
			throw new IllegalArgumentException("Cannot withdraw a negative amount");
		} else if (money > balance) {
			throw new IllegalArgumentException("Not Sufficient Funds to withdraw");
		} else {
			balance -= money;
		}
	}
	
	@Override
	public String toString() {
		return "First Name:" + getFirstName() + " Last Name:" + getLastName() + " Balance:" + String .format("%.1f", getBalance());
	}
}

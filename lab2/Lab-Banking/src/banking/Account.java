package banking;

public class Account {

	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private double balance;
	
	//Constructors
	public Account() { }
	public Account(String firstName, String lastName, String address, String phoneNumber, double balance) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
	}


	//Getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	/**
	 * 
	 * @param money
	 * @return
	 */
	public boolean withdraw(double money) {
		if(balance + money >= 0 && balance > 0 && money < 0) {
			balance += money;
			return true;
		}
		
		if(money > 0)
			System.out.println("The withdraw money should be negative!");
		if(balance + money < 0)
			System.out.println("Requested amount is above the available balance!");
		return false;
	}
	
	/**
	 * 
	 * @param money
	 * @return
	 */
	public boolean deposit(double money) {
		if(money > 0 && balance >= 0) {
			balance += money;
			return true;
		}
		
		if(money <= 0)
			System.out.println("The deposit money should be positive!");
		if(balance < 0)
			System.out.println("The Balance is negative!");
		return false;
	}
	
}

package banking;

public class CheckingAccount extends Account {
	
	private double monthlyFees; 
	private double overdraftLimit;
	private boolean overdraftActive; 
	private double overdraftFees;
	
	//Constructors
	public CheckingAccount() {}
	public CheckingAccount(double monthlyFees, double overdraftLimit, boolean overdraftActive, double overdraftFees) {
		super();
		this.monthlyFees = monthlyFees;
		this.overdraftLimit = overdraftLimit;
		this.overdraftActive = overdraftActive;
		this.overdraftFees = overdraftFees;
	}


	//Getters and setters
	public double getMonthlyFees() {
		return monthlyFees;
	}
	public void setMonthlyFees(double monthlyFees) {
		this.monthlyFees = monthlyFees;
	}
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	public boolean isOverdraftActive() {
		return overdraftActive;
	}
	public void setOverdraftActive(boolean overdraftActive) {
		this.overdraftActive = overdraftActive;
	}
	public double getOverdraftFees() {
		return overdraftFees;
	}
	public void setOverdraftFees(double overdraftFees) {
		this.overdraftFees = overdraftFees;
	}
	
	
	@Override
	public boolean withdraw(double money) {
		if(overdraftActive && getBalance() + money > overdraftLimit * -1 && money < 0) {
			setBalance(getBalance() + money);
			return true;
		} else if (getBalance() + money < overdraftLimit * -1) {
			System.out.println("Your withdrawal exceeds the overdraft limit.");
			return false;
		} else if(money > 0) {
			System.out.println("The withdraw money should be negative!");
			return false;
		} else {
			return super.withdraw(money);
		}
	}
	
	@Override
	public boolean deposit(double money) {
		
		if(overdraftActive && money > 0) {
			setBalance(getBalance() + money);
			return true;
		}
		
		return super.deposit(money);
	}
}

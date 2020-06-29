package banking;

public class BankingTester {

	public static void main(String[] args) {
		//Instantiate account
		System.out.println("========== Account Class ==========");
		Account myaccount = new Account();
		myaccount.setFirstName("Yu-Hsuan");
		myaccount.setLastName("Huang");
		myaccount.setAddress("1 Georgian Street, Barrie, ON, CA");
		myaccount.setPhoneNumber("(647)123-4567");
		myaccount.setBalance(5000);
		
		//withdraw - 1
		System.out.println("Balance(Before): " + myaccount.getBalance());
		System.out.println("Withdraw: -500");
		myaccount.withdraw(-500);
		System.out.println("Balance(After): " + myaccount.getBalance() +"\n");
		
		//withdraw - 2
		System.out.println("Balance(Before): " + myaccount.getBalance());
		System.out.println("Withdraw: -5000");
		myaccount.withdraw(-5000);
		System.out.println("Balance(After): " + myaccount.getBalance() +"\n");
		
		//deposit - 1
		System.out.println("Balance(Before): " + myaccount.getBalance());
		System.out.println("Deposit: 1500");
		myaccount.deposit(1500);
		System.out.println("Balance(After): " + myaccount.getBalance() +"\n");
		
		
		
		//Instantiate checking account (No OD)
		System.out.println("========== Checking Account (no OD) ==========");
		CheckingAccount mycheckAccount1 = new CheckingAccount();
		mycheckAccount1.setFirstName("Winnie");
		mycheckAccount1.setLastName("Lai");
		mycheckAccount1.setAddress("2 Georgain Street, Barrie, ON, CA");
		mycheckAccount1.setPhoneNumber("(647)987-6543");
		mycheckAccount1.setBalance(5000);
		mycheckAccount1.setMonthlyFees(25);
		mycheckAccount1.setOverdraftActive(false);
		
		//withdraw - 1
		System.out.println("Balance(Before): " + mycheckAccount1.getBalance());
		System.out.println("Withdraw: -4500");
		mycheckAccount1.withdraw(-4500);
		System.out.println("Balance(After): " + mycheckAccount1.getBalance() +"\n");

		//withdraw - 2
		System.out.println("Balance(Before): " + mycheckAccount1.getBalance());
		System.out.println("Withdraw: -4500");
		mycheckAccount1.withdraw(-4500);
		System.out.println("Balance(After): " + mycheckAccount1.getBalance() +"\n");
		
		//deposit - 1
		System.out.println("Balance(Before): " + mycheckAccount1.getBalance());
		System.out.println("Deposit: 1500");
		mycheckAccount1.deposit(1500);
		System.out.println("Balance(After): " + mycheckAccount1.getBalance() +"\n");
		
		
		
		//Instantiate checking account (No OD)
		System.out.println("========== Checking Account (OD) ==========");
		CheckingAccount mycheckAccount2 = new CheckingAccount();
		mycheckAccount2.setFirstName("Joseph");
		mycheckAccount2.setLastName("Lee");
		mycheckAccount2.setAddress("3 Georgain Street, Barrie, ON, CA");
		mycheckAccount2.setPhoneNumber("(647)456-7890");
		mycheckAccount2.setBalance(5000);
		mycheckAccount2.setMonthlyFees(25);
		mycheckAccount2.setOverdraftActive(true);
		mycheckAccount2.setOverdraftFees(35);
		mycheckAccount2.setOverdraftLimit(1000);
		
		//withdraw - 1
		System.out.println("Balance(Before): " + mycheckAccount2.getBalance());
		System.out.println("Overdraft limit: " + mycheckAccount2.getOverdraftLimit());
		System.out.println("Withdraw: -4500");
		mycheckAccount2.withdraw(-4500);
		System.out.println("Balance(After): " + mycheckAccount2.getBalance() +"\n");

		//withdraw - 2
		System.out.println("Balance(Before): " + mycheckAccount2.getBalance());
		System.out.println("Overdraft limit: " + mycheckAccount2.getOverdraftLimit());
		System.out.println("Withdraw: -1000");
		mycheckAccount2.withdraw(-1000);
		System.out.println("Balance(After): " + mycheckAccount2.getBalance() +"\n");
		
		//withdraw - 3
		System.out.println("Balance(Before): " + mycheckAccount2.getBalance());
		System.out.println("Overdraft limit: " + mycheckAccount2.getOverdraftLimit());
		System.out.println("Withdraw: -1000");
		mycheckAccount2.withdraw(-1000);
		System.out.println("Balance(After): " + mycheckAccount2.getBalance() +"\n");

		//deposit - 1
		System.out.println("Balance(Before): " + mycheckAccount2.getBalance());
		System.out.println("Deposit: 1500");
		mycheckAccount2.deposit(1500);
		System.out.println("Balance(After): " + mycheckAccount2.getBalance() +"\n");
		
		//deposit - 2
		System.out.println("Balance(Before): " + mycheckAccount2.getBalance());
		System.out.println("Deposit: 1500");
		mycheckAccount2.deposit(1500);
		System.out.println("Balance(After): " + mycheckAccount2.getBalance() +"\n");
	}
	
}

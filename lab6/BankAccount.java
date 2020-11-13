package labs.lab6;

public class BankAccount {
	
	int accountNumber;
	double balance;
	
	// Constructor that creates a BankAccount object with the given account number and initial balance
	public BankAccount(int accountNumber, double initialBalance)  {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}
	
	// returns the balance
	public double getBalance() {
		return balance;
	}
	
	// sets the balance to the given amount
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// returns the account number
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.readFile("./src/labs/lab6/accounts1.dat");
		BankAccount highest = bank.getHighestBalanceAccount();
		System.out.println(highest.getAccountNumber() + " " + highest.getBalance());
		bank.readFile("./src/labs/lab6/accounts2.dat");
		highest = bank.getHighestBalanceAccount();
		System.out.println(highest.getAccountNumber() + " " + highest.getBalance());

		/*
		The above prints:
		9 34897.0
		5 35000.98
		*/
	}
}

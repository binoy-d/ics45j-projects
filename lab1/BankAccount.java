package labs.lab1;

public class BankAccount {
	private double balance;
	private int numTransactions;
	private int numFreeTransactions;
	private double fee;
	
	//Constructs a bank account with $0 balance and free number of free transactions
	public BankAccount(int free) {
		this.balance = 0;
		this.numFreeTransactions = free;
	}
	
	//Constructs a bank account with an initial balance of initialBalance and free number of free transactions
	public BankAccount(double initialBalance, int free) {
		this.numFreeTransactions = free;
		this.balance = initialBalance;
	}
	
	//Deposits the amount of money into the account
	public void deposit(double amount) {
		balance+=amount;
		numTransactions++;
	}
	
	//Withdraws the amount of money from the account
	public void withdraw(double amount) {
		balance-=amount;
		numTransactions++;
	}
	
	
	//Returns the current balance of the account
	public double getBalance(){
		return balance;
	}
	
	//Sets the transaction fee to fee
	public void setTransactionFee(double fee) {
		this.fee = fee;
	}
	
	//Applies the monthly transaction charge
	public void deductMonthlyCharge() {
		balance-= numTransactions>numFreeTransactions?(fee*numTransactions-numFreeTransactions):0;
		numTransactions = 0;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount momsSavings = new BankAccount(1000, 3); // creates a new account with balance of $1000 and 3 free transactions

		momsSavings.setTransactionFee(1.00);
		momsSavings.deposit(100);
		momsSavings.withdraw(10);
		momsSavings.withdraw(30);
		momsSavings.withdraw(27.25);
		momsSavings.deposit(30);
		momsSavings.deposit(12);
		momsSavings.deductMonthlyCharge();
		System.out.println(momsSavings.getBalance()); // should print 1071.75
	}

}

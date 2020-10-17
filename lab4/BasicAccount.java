package labs.lab4;

public class BasicAccount extends BankAccount{
	public BasicAccount(double d) {
		super(d);
	}

	public void withdraw(double amount) {
		if(getBalance()>=amount) {
			super.withdraw(amount);
		}
	}
	
	public static void main(String[] args) {
		BankAccount account = new BasicAccount(100.00); // creates a BasicAccount with an initial balance of 100.00
		account.withdraw(80.00); 
		System.out.println(account.getBalance()); // returns 20.0
		account.withdraw(50.00); // amount won't be withdrawn since it's greater than balance
		System.out.println(account.getBalance()); // returns 20.0
	}
}

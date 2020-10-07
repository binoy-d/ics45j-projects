package labs.lab3;

public class Customer {
	String name;
	double amountSpent;
	 // Constructor that creates this Customer
	public Customer(String name) {
		this.name = name;
		this.amountSpent = 0;
	}
	
	// Returns the name of the Customer
	public String getName() {
		return name;
	}
	
	// Returns the amount the Customer has spent
	public double getAmountSpent() {
		return amountSpent;
	}
	
	// Adds the amount to the Customer's amount spent
	public void addSale(double amount) {
		amountSpent+=amount;
	}
}

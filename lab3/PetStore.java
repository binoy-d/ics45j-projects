package labs.lab3;

import java.util.ArrayList;

public class PetStore {

	ArrayList<Customer> customers;
	Customer best;
	// Constructor that creates this PetStore
	public PetStore() {
		customers = new ArrayList<Customer>();
		best = null;
	}
	
	// Adds a new Customer to the PetStore
	public void addCustomer(Customer c) {
		customers.add(c);
		if(best == null) {
			best = c;
		}else if(c.getAmountSpent()>best.getAmountSpent()) {
			best = c;
		}
	}
	
	// Returns the name of the Customer who has spent the most money. If there are no customers, return the empty string. If there is more than one "best customer," return any one of them.
	public String getNameOfBestCustomer() {
		return best==null?"":best.getName();
	}
}

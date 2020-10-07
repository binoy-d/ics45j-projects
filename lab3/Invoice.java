package labs.lab3;

import java.util.ArrayList;

public class Invoice {
	ArrayList<Item> items;
	
	// Constructor that creates this Invoice
	public Invoice() {
		items = new ArrayList<Item>();
	}
	// Adds an Item to this Invoice
	void addItem(Item i) {
		items.add(i);
	}
	// Returns the total charge for this Invoice
	double getTotal() {
		double sum = 0;
		for(Item i: items) {
			sum+=i.getPrice();
		}
		return sum;
	}
}

package labs.lab3;

public class Item {
	// Constructor that creates this Item
	double price;
	boolean edible;
	int quantity;
	public Item(double price, boolean edible, int quantity) {
		this.price = price;
		this.edible = edible;
		this.quantity = quantity;
	}
	// Returns the price of the Item
	public double getPrice() {
		return price*quantity*(edible?0.9:1);
	}
	// Returns whether the Item is edible or not
	public boolean isEdible() {
		return edible;
	}
	// Returns the quantity of the Item
	public int getQuantity() {
		return quantity;
	}
}

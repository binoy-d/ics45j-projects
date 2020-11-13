package labs.lab6;

public class Sale {
	
	String name;
	String service;
	double amount;
	String date;
	
	
	// Constructor that creates a Sale object with the given info
	public Sale(String name, String service, double amount, String date)  {
		this.name = name;
		this.service = service;
		this.amount = amount;
		this.date = date;
	}
	
	// returns the client name
	public String getName() {
		return name;
	}
	
	// returns the service category
	public String getServiceCategory() {
		return service;
	}
	
	// returns the cost of service
	public double getAmount() {
		return amount;
	}
	
	// returns the date of service
	public String getDate() {
		return date;
	}
}

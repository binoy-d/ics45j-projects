package labs.lab9;

import java.util.Map;

public class Customer implements Comparable<Object> {

	private String name, email, location, notes;
	private Map<String, Boolean> pets;
	private double amountSpent;
	
	
	
	
	
	public Customer(String name, String email, Map<String, Boolean> pets,double amountSpent, String location, String notes) {
		this.name = name;
		this.email = email;
		this.pets = pets;
		this.location = location;
		this.amountSpent = amountSpent;
		this.notes = notes;
	}
	
	public String toString() {
		return this.name;
	}
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the pets
	 */
	public Map<String, Boolean> getPets() {
		return pets;
	}


	/**
	 * @param pets the pets to set
	 */
	public void setPets(Map<String, Boolean> pets) {
		this.pets = pets;
	}


	/**
	 * @return the amountSpent
	 */
	public double getAmountSpent() {
		return amountSpent;
	}


	/**
	 * @param amountSpent the amountSpent to set
	 */
	public void setAmountSpent(double amountSpent) {
		this.amountSpent = amountSpent;
	}


	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}


	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}


	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}


	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Customer c = (Customer)o;
		return name.compareTo(c.getName());
	}
	@Override
    public boolean equals(Object o) { 
  
        if (o == this) { 
            return true; 
        } 
        if (!(o instanceof Customer)) { 
            return false; 
        } 
        //2 customers with the same name are essentially the same
        Customer c = (Customer) o; 
        return name.equals(c.getName());
    } 
} 
	
	
	



package labs.lab7;

import java.util.ArrayList;
import java.util.Stack;

public class Driveway {
	// Stack representing cars in the driveway
	private Stack<Integer> driveway;
	// Stack representing cars on the street
	private Stack<Integer> street; 
	
	// constructor
	public Driveway() {
		driveway = new Stack<Integer>();
		street = new Stack<Integer>();
	}
	
	// Returns a String representation of the driveway
	// For a driveway stack with cars 1, 2, 3, and 4, 
	// with 1 first-in and 4 first-out, the string returned
	// by this method would be: "Driveway: 1 2 3 4"
	public String getDriveway() {
		String out = driveway.toString();
		return "Driveway: "+out.substring(1, out.length()-1).replace(",","");
	}
	// Returns a String representation of the street. 
	// For a street stack with cars 1, 2, 3, and 4, with 
	// 1 first-in and 4 first-out, the string returned by
	// this method would be: "Street: 1 2 3 4"
	public String getStreet() {
		String out = street.toString();
		return "Street: "+out.substring(1, out.length()-1).replace(",","");
	}
	
	// Adds the given license plate to the driveway if it's 
	// not already there; Returns a log of the process 
	public ArrayList<String> add(int licensePlate) {
		ArrayList<String> out = new ArrayList<String>();
		if(driveway.contains(licensePlate)) {
			out.add("That car is already in the driveway.");
			return out;
		}
		driveway.push(licensePlate);
		out.add(getDriveway());
		out.add(getStreet());
		return out;
	}
	
	// Removes the given license plate to the driveway if 
	// it's there; Returns a log of the process 
	public ArrayList<String> remove(int licensePlate) {
		ArrayList<String> out = new ArrayList<String>();
		if(!driveway.contains(licensePlate)) {
			out.add("That car is not in the driveway.");
			return out;
		}else {
			//move cars onto street until target car is at top of stack
			if(driveway.peek() == licensePlate) {
				driveway.pop()
;				out.add(getDriveway());
				out.add(getStreet());
				return out;
			}
			
			
			while(driveway.peek()!=licensePlate) {
				street.push(driveway.pop());
				out.add(getDriveway());
				out.add(getStreet());
			}
			//remove last car
			driveway.pop();
			//move cars back from street to driveway
			while(!street.isEmpty()) {
				driveway.push(street.pop());
				out.add(getDriveway());
				out.add(getStreet());
			}
		}
		
		return out;
	}
}

package labs.lab6;

import java.util.ArrayList;

/*
 * Airline Seating. Part II. Complete the Airplane class here
 */
public class Airplane {
	public static final int FIRST = 0;
	public static final int ECONOMY = 1;

	public static final int FIRST_CLASS_ROWS = 5;
	public static final int ECONOMY_CLASS_ROWS = 15;

	public static final int SEATS_IN_FIRST_CLASS_ROW = 4;
	public static final int SEATS_IN_ECONOMY_CLASS_ROW = 6;

	ArrayList<SeatRow> rows;
	/**
	 * Constructs an Airplane object.
	 */
	public Airplane() {
		// FILL IN
		rows = new ArrayList<SeatRow>();
		for(int i = 0; i<FIRST_CLASS_ROWS; i++) {
			rows.add(new SeatRow(SEATS_IN_FIRST_CLASS_ROW));
		}
		for(int i = 0; i<ECONOMY_CLASS_ROWS; i++) {
			rows.add(new SeatRow(SEATS_IN_ECONOMY_CLASS_ROW));
		}
	}

	/**
	 * Adds the passengers to the plane.
	 * 
	 * @param tclass     the type of class
	 * @param npassenger the number of passengers
	 * @param where      where the passenger wants to sit
	 * @return true if the assignment succeeded.
	 */
	public boolean addPassengers(int tclass, int npassenger, int where) { 
		if(tclass!=FIRST && tclass!=ECONOMY) return false;
		if(npassenger>2+tclass || npassenger<1) return false; 
		
		int startingRow = tclass==FIRST?FIRST_CLASS_ROWS:FIRST_CLASS_ROWS+ECONOMY_CLASS_ROWS;
		int endingRow = tclass==FIRST?0:FIRST_CLASS_ROWS;
		
		//loop from back to front
		for(int i = startingRow-1; i>=endingRow ; i--) {
			if(rows.get(i).addPassengers(npassenger, where)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Gets a string displaying the seating of the airplane.
	 * 
	 * @return the seating chart
	 */
	public String toString() {
		String out = "";
		for(int i = 0; i<FIRST_CLASS_ROWS+ECONOMY_CLASS_ROWS; i++) {
			if(i<9) {
				out+=" ";
			}
			out+=(i+1)+" ";
			out+=rows.get(i).toString()+"\n";
		}

		return out; 
	}
	
}

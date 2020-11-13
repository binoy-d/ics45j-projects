package labs.lab6;

/**
 * SeatRow class that represents a row
 * of seats.
 */
public class SeatRow {
	public static final int WINDOW = 0;
	public static final int CENTER = 1;
	public static final int AISLE = 2;
	
	private boolean[] seats;
	private int numFreeSpots;
	/**
	 * Constructs a SeatRow object.
	 * 
	 * @param numSeats the number of seats in this row;
	 */
	public SeatRow(int numSeats) {
		// FILL IN
		this.seats = new boolean[numSeats];
		numFreeSpots = numSeats;
	}

	/**
	 * Adds passenger(s)s to seat(s), based on preference.
	 * 
	 * @param npassenger the number of passengers
	 * @param preference      where the passengers want to be seated
	 * @returns true if the passenger can be added, false otherwise
	 */
	public boolean addPassengers(int numPassengers, int preference) {
		if(numPassengers>numFreeSpots) return false;

		//left to right
		for(int startPos = 0; startPos<=seats.length-numPassengers; startPos++) {
			int endPos = startPos+numPassengers-1;
			boolean prefWorks = true;
			if(seats.length == 4) {
				prefWorks = true;
			}else {
				if(preference == WINDOW) {
					prefWorks = startPos==0 || endPos == seats.length-1;
				}else if(preference == AISLE) {
					prefWorks = endPos == 2 || startPos == 3;
				}else if(preference == CENTER) {
					prefWorks = (startPos == 0 && endPos > 1) || (startPos>=3 &&endPos>=4);
				}else {
					prefWorks = false;
				}
			}
			if(prefWorks && add(startPos, endPos)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Adds (a) passenger(s) to a seat, if possible
	 * 
	 * @param from a starting seat, inclusive
	 * @param to   an ending seat, inclusive
	 * @return true if all the seat(s) in the range can be added, false otherwise
	 */
	public boolean add(int from, int to) {
		for(int i = from; i<=to; i++) {
			if(seats[i]) {
				return false;
			}
		}
		for(int i = from; i<=to; i++) {
			seats[i] = true;
		}
		return true; 
	}

	/**
	 * Gets a string displaying the seating of this row Use . for an unoccupied
	 * seat, * for occupied. 1st class seats have a space between each seat, economy
	 * seats have a space between each set of three. See the example in the assignment 
	 * for more details.
	 * 
	 * @return the seating chart
	 */
	public String toString() {
		String out = "[";
		if(seats.length == 4) {
			out+=(seats[0]?"* ":". ");
			out+=(seats[1]?"* ":". ");
			out+=(seats[2]?"* ":". ");
			out+=(seats[3]?"*":".");
		}else if(seats.length == 6) {
			out+=(seats[0]?"*":".");
			out+=(seats[1]?"*":".");
			out+=(seats[2]?"* ":". ");
			out+=(seats[3]?"*":".");
			out+=(seats[4]?"*":".");
			out+=(seats[5]?"*":".");
		}
		return out+="]"; // FIX ME
	}
}

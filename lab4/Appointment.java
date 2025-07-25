package labs.lab4;

/**
 * A class to keep track of an appointment.
 */
public abstract class Appointment {
	private String description;

	/**
	 * Constructs an appointment without a description.
	 */
	public Appointment() {
		description = "";
	}

	/**
	 * Sets the description of this appointment.
	 * 
	 * @param description the text description of the appointment
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

	/**
	 * Determines if this appointment occurs on the given date.
	 * 
	 * @param year  the year
	 * @param month the month
	 * @param day   the day
	 * @return true if the appointment occurs on the given date.
	 */
	public abstract boolean occursOn(int year, int month, int day);

	/**
	 * Converts appointment to string description.
	 */
	public String toString() {
		return description;
	}
	
	// returns true if otherObject has the same instance variable(s) value(s) as this Appointment
	public boolean equals(Object otherObject) {
		if(otherObject == this) {
			return true;
		}
		if(!(otherObject instanceof Appointment)) {
			return false;
		}
		Appointment o = (Appointment)otherObject;
		return o.getDescription().equals(description);
		
	}
}

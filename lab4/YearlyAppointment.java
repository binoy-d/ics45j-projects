package labs.lab4;

public class YearlyAppointment extends Appointment{
	private int month;
	private int day;
	
	// Constructs a OnetimeAppointment with the given date and description; 
	// assume year, month, and day are valid inputs for these values
	public YearlyAppointment(int month, int day, String description) {
		setDescription(description);
		this.month = month;
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	// Returns true if this appointment occurs on the given date;
	//overrides Appointment.occursOn; assume year, month, and day are valid inputs for these values
	public boolean occursOn(int year, int month, int day) {
		return this.month == month && this.day == day;
	}
	
	// returns true if otherObject has the same instance variable(s) value(s) as this OnetimeAppointment
	public boolean equals(Object otherObject) {
		if(!super.equals(otherObject)) {
			return false;
		}
		if(!(otherObject instanceof YearlyAppointment)) {
			return false;
		}
		YearlyAppointment o = (YearlyAppointment)otherObject;
		return 	month == o.getMonth() &&
				day == o.getDay();
	}
}

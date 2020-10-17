package labs.lab4;

public class DailyAppointment extends Appointment{
	
	public DailyAppointment(String description) {
		setDescription(description);
	}
	// Returns true if this appointment occurs on the given date;
	//overrides Appointment.occursOn; assume year, month, and day are valid inputs for these values
	public boolean occursOn(int year, int month, int day) {
		return true;
	}
	
	// returns true if otherObject has the same instance variable(s) value(s) as this OnetimeAppointment
	public boolean equals(Object otherObject) {
		if(!super.equals(otherObject)) {
			return false;
		}
		if(!(otherObject instanceof DailyAppointment)) {
			return false;
		}
		return true;
	}
}

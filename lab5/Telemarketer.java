package labs.lab5;

public class Telemarketer extends Person implements Pest{
	
	public Telemarketer(String name) {
		super(name);
	}

	// returns the string "Call during dinner"
	private String callDuringDinner() {
		return "Call during dinner";
	}
	
	// returns the string "Continue talking when you say no"
	private String continueTalkingWhenYouSayNo() {
		return "Continue talking when you say no";
	}
	
	// returns the string made up of callDuringDinner() and continueTalkingWhenYouSayNo(), separated by a new line
	public String annoy() {
		return callDuringDinner()+"\n"+continueTalkingWhenYouSayNo();
	}
}

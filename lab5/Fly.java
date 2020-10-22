package labs.lab5;

public class Fly implements Pest{
	
	// returns the string "Fly around your head"
	private String flyAroundYourHead() {
		return "Fly around your head";
	}
	
	// returns the string "Land on things"
	private String landOnThings() {
		return "Land on things";
	}
	
	// returns the string made up of flyAroundYourHead() and landOnThings(), separated by a new line
	public String annoy() {
		return flyAroundYourHead()+"\n"+landOnThings();
	}
}

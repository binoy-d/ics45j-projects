package labs.lab5;

public class Ad implements Pest{
	// returns the string "Block something you really want to see"
	private String blockSomethingYouReallyWantToSee() {
		return "Block something you really want to see";
	}
	
	// returns the string "Don't go away even when you click X"
	private String dontGoAwayEvenWhenYouClickX() {
		return "Don't go away even when you click X";
	}
	
	// returns the string made up of blockSomethingYouReallyWantToSee() and dontGoAwayEvenWhenYouClickX(), separated by a new line
	public String annoy() {
		return blockSomethingYouReallyWantToSee()+"\n"+dontGoAwayEvenWhenYouClickX();
	}
}

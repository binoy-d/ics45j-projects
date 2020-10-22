package labs.lab5;

public class Sibling extends Person implements Pest{
	
	public Sibling(String name) {
		super(name);
	}

	// returns the string "Tease you about your insecurities"
	private String teaseYouAboutYourInsecurities() {
		return "Tease you about your insecurities";
	}
	
	// returns the string "Laugh at you when you are mad"
	private String laughAtYouWhenYouAreMad() {
		return "Laugh at you when you are mad";
	}
	
	// returns the string made up of teaseYouAboutYourInsecurities() and laughAtYouWhenYouAreMad(), separated by a new line
	public String annoy() {
		return teaseYouAboutYourInsecurities()+"\n"+laughAtYouWhenYouAreMad();
	}
}

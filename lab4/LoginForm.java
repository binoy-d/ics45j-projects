package labs.lab4;

public class LoginForm {
	private String expectedUsername;
	private String expectedPassword;
	private String currentPassword;
	private String currentUsername;
	private boolean loggedIn; 
	
	
	// Constructor that takes in the expected username and password
	public LoginForm(String expectedUsername, String expectedPassword) {
		this.expectedUsername = expectedUsername;
		this.expectedPassword = expectedPassword;
		currentUsername = null;
		currentPassword = null;
		loggedIn = false;
	}
	
	
	// Takes the text as input for username if username doesn't already have a value;
	// Takes the text as input for password if username does have a value but password doesn't have a value;
	// Ignores the text if both username and password already have a value
	public void input(String text) {
		if(currentUsername == null) {
			currentUsername = text;
		}else if(currentPassword == null) {
			currentPassword = text;
		}
	}
	
	// If button == "Submit", this submits the form;
	// if button == "Reset", this resets the form (the values for username and password);
	// If button == any other value, does nothing
	public void click(String button) {
		if(button.equals("Submit")) {
			loggedIn = 	currentUsername!=null &&
						currentPassword!=null &&
						currentUsername.equals(expectedUsername) &&
						currentPassword.equals(expectedPassword);
			if(!loggedIn) {
				currentUsername = null;
				currentPassword = null;
			}
			
		}else if(button.equals("Reset")) {
			currentUsername = null;
			currentPassword = null;
		}
	}
	
	// Returns true if the user is logged in; false otherwise
	public boolean isLoggedIn() {
		return loggedIn;
	}
	
	
	public static void main(String[] args) {
		LoginForm login = new LoginForm("admin", "admin123");
		login.input("test");
		login.input("test123");
		login.click("Submit");
		System.out.println(login.isLoggedIn()); // returns false
		login.input("admin");
		login.input("admin123");
		login.click("Reset");
		System.out.println(login.isLoggedIn()); // returns false
		login.click("Submit");
		System.out.println(login.isLoggedIn()); // returns false
		login.input("admin");
		login.input("admin123");
		login.input("test");
		login.input("test123");
		login.click("Submit");
		System.out.println(login.isLoggedIn()); // returns true
		login.input("test");
		login.input("test123");
		login.click("Submit");
		System.out.println(login.isLoggedIn()); // returns true
	}
}

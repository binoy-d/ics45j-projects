package labs.lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoginFormTest {

	
	// Tests that a correct username + an incorrect password does not allow the user to log in
	@Test
	void testCorrectUsernameIncorrectPassword(){
		LoginForm login = new LoginForm("admin", "admin123");
		login.input("admin");
		login.input("bruh");
		login.click("Submit");
		assertFalse(login.isLoggedIn());
	}
	
	// Tests that an incorrect username + a correct password does not allow the user to log in
	@Test
	void testIncorrectUsernameCorrectPassword() {
		LoginForm login = new LoginForm("admin", "admin123");
		login.input("bruh");
		login.input("admin123");
		login.click("Submit");
		assertFalse(login.isLoggedIn());
	}
	
	// Tests that providing correct username and password on first try allows the user to log in
	@Test
	void testCorrectCredentialsFirstTry() {
		LoginForm login = new LoginForm("admin", "admin123");
		login.input("admin");
		login.input("admin123");
		login.click("Submit");
		assertTrue(login.isLoggedIn());
	}
	
	// Tests that the following steps allow the user to log in: 
	//1) Provide incorrect credentials, 
	//2) Submit 
	// 3) Provide correct credentials 
	//4) Submit
	@Test
	void testIncorrectFirstCorrectSecond() {
		LoginForm login = new LoginForm("admin", "admin123");
		login.input("admin");
		login.input("wrong");
		login.click("Submit");
		assertFalse(login.isLoggedIn());
		login.input("admin");
		login.input("admin123");
		login.click("Submit");
		assertTrue(login.isLoggedIn());
	}
	
	// Tests that the user stays logged in after correct credentials are submitted, even if incorrect credentials are then submitted: 
	//1) Provide correct credentials,
	//2) Submit 
	//3) Provide incorrect credentials 
	//4) Submit
	@Test
	void testCorrectFirstIncorrectSecond() {
		LoginForm login = new LoginForm("admin", "admin123");
		login.input("admin");
		login.input("admin123");
		login.click("Submit");
		assertTrue(login.isLoggedIn());
		login.input("wrong");
		login.input("admin123");
		login.click("Submit");
		assertTrue(login.isLoggedIn());
	}

}

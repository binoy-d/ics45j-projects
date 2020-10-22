package labs.lab5;

public abstract class Enemy {
	
	private int health;
	// constructor that initializes the Enemy's health to 100
	public Enemy() {
		health = 100;
	}
	// returns the Enemy's health
	public int getHealth() {
		return health;
	}
	
	// sets health to the given amount, within the bounds of 0 and 100 (inclusive) 
	// (if the given amount is > 100, sets it to 100; if the given amount is < 0, sets it to 0)
	public void setHealth(int health) {
		if(health>100) this.health = 100;
		else if(health<0) this.health = 0;
		else this.health = health;
	}
}

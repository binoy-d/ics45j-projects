package labs.lab5;

public class Zombie extends Enemy implements Stompable, GameElement{
	private double height;
	
	// constructor that initializes the Zombie's height to the given value
	public Zombie(double height) {
		this.height = height;
	}
	
	// returns this Zombie's height
	public double getHeight() {
		return height;
	}
	
	// 1) shortens the Zombie's height by 50%
	// 2) decrements the Zombie's health by 25,
	// 3) returns no change to the player's health
	public int stompOn() {
		height*=0.5;
		setHealth(getHealth()-25);
		return 0;
	}
	
	// 1) increases the Zombie's height by 10% 
	// 2) increments the Zombie's health by 5
	public void tick() {
		height*=1.1;
		setHealth(getHealth()+5);
	}
}

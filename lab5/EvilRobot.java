package labs.lab5;

public class EvilRobot extends Enemy implements Stompable, GameElement{
	private int strength;
	
	// constructor that initializes the EvilRobot's strength to the given value
	public EvilRobot(int strength) {
		this.strength = strength;
	}
	
	// returns this EvilRobot's strength
	public int getStrength() {
		return strength;
	}
	
	// 1) decreases the EvilRobot's strength by 10%,
	// 2) returns no change to the player's health
	public int stompOn() {
		strength*=0.9;
		return 0;
	}
	
	// increases the EvilRobot's strength by 10%
	public void tick() {
		strength*=1.1;
	}
}

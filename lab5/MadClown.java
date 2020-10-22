package labs.lab5;

public class MadClown extends Enemy implements GameElement{
	private boolean weapon;
	
	// constructor that sets whether or not this MadClown has a weapon
	public MadClown(boolean weapon) {
		this.weapon = weapon;
	}
	
	// returns whether or not this MadClown has a weapon
	public boolean hasWeapon() {
		return weapon;
	}
	
	// decrements the MadClown's health by 1
	public void tick() {
		setHealth(getHealth()-1);
	}
	
}

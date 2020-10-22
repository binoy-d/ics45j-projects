package labs.lab5;

public class Dragon extends Enemy implements Stompable, GameElement{
	private boolean fireBreathing;
	
	// constructor that sets whether or not this Dragon breathes fire
	public Dragon(boolean fireBreathing) {
		this.fireBreathing = fireBreathing;
	}
	
	// returns whether or not this Dragon breathes fire
	public boolean isFireBreathing() {
		return fireBreathing;
	}
	// 1) toggles fireBreathing from true to false or vice-versa,
	// 2) increments the Dragon's health by 50,
	// 3) takes this 50 health from the player by returning a -50 from this method
	public int stompOn() {
		fireBreathing = !fireBreathing;
		setHealth(getHealth()+50);
		return -50;
	}
	// 1) decrements the Dragon's health by 20
	public void tick() {
		setHealth(getHealth()-20);
	}
}

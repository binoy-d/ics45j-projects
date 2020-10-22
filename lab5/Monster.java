package labs.lab5;

public class Monster extends Enemy implements GameElement, Stompable{
	
	private String color;
	// constructor that initializes the Monster's color to "green"
	public Monster() {
		color = "green";
	}
	// returns the Monster's current color
	public String getColor() {
		return color;
	}
	// 1) changes the Monster's color to "red",
	// 2) decrements the Monster's health by 100,
	// 3) gives this 100 health to the player by returning it from this method
	public int stompOn() {
		color = "red";
		setHealth(getHealth()-100);
		return 100;
	}
	
	// 1) decrements the Monster's health by 10
	// 2) changes Monster's color to the next one in the cycle green, yellow, blue, green, yellow, blue, ...,
	//    OR if the Monster is red (from a stomp), starts the cycle over again with green
	public void tick() {
		setHealth(getHealth()-10);
		switch(color) {
			case "green":
				color = "yellow";
				break;
			case "yellow":
				color = "blue";
				break;
			case "blue":
				color = "green";
				break;
			case "red":
				color = "green";
				break;
		}
	}
}

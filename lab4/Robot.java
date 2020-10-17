package labs.lab4;

import java.awt.Point;

public class Robot {
	
	private Point location;
	private String direction;
	// Constructor that creates a Robot at location (0, 0) and facing north
	public Robot() {
		this.location = new Point(0, 0);
		this.direction = "N";
	}
	
	// Changes the direction but not the location
	public void turnLeft() {
		switch(direction) {
			case "N":
				direction = "W";
				break;
			case "S":
				direction = "E";
				break;
			case "E":
				direction = "N";
				break;
			case "W":
				direction = "S";
				break;
		}
	}
	
	// Changes the direction but not the location
	public void turnRight() {
		switch(direction) {
			case "N":
				direction = "E";
				break;
			case "S":
				direction = "W";
				break;
			case "E":
				direction = "S";
				break;
			case "W":
				direction = "N";
				break;
		}
	}
	
	// Moves the robot by one unit in the direction it is facing. Returns true if the robot is still on the plane, or false if it has fallen off.
	//Note: This method can still be called on a robot that has fallen off the plane, and its location should be updated as if it was still on the plane.
	public boolean move() {
		switch(direction) {
			case "N":
				location.translate(0, 1);
				break;
			case "S":
				location.translate(0, -1);
				break;
			case "E":
				location.translate(1, 0);
				break;
			case "W":
				location.translate(-1, 0);
				break;
		}
		return location.getX()>=-5 && location.getX()<=5 && location.getY()>=-5 && location.getY()<=5;
	}
	
	// Returns the robot's current location
	public Point getLocation() {
		return location;
	}
	
	// Returns "N", "E", "S", or "W"
	public String getDirection() {
		return direction;
	}
}

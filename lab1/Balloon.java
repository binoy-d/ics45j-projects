package labs.lab1;

import java.lang.Math;

public class Balloon {
	private double radius;
	
	
	public Balloon() {
		this.radius = 0;
	}
	
	public void inflate(double amount) {
		radius+=amount;
	}
	
	public double getVolume() {
		return (4.0/3)*Math.PI*radius*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balloon balloon = new Balloon();
		System.out.println(balloon.getVolume()); // should print 0.0
		balloon.inflate(2.0);
		System.out.println(balloon.getVolume()); // should print 33.510321638291124
		balloon.inflate(4.0);
		System.out.println(balloon.getVolume()); // should print 904.7786842338604
	}

}

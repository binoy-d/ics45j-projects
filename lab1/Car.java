package labs.lab1;

/**
 * A car can drive and consume fuel.
 */
public class Car {
	private double gas;
	private double efficiency;

	/**
	 * Constructs a car with a given fuel efficiency.
	 * 
	 * @param anEfficiency the fuel efficiency of the car
	 */
	public Car(double anEfficiency) {
		// WRITE YOUR CODE HERE
		this.efficiency = anEfficiency;
		this.gas = 0;
	}

	/**
	 * Adds gas to the tank.
	 * 
	 * @param amount the amount of fuel to add
	 */
	public void addGas(double amount) {
		// WRITE YOUR CODE HERE
		gas+=amount;
	}

	/**
	 * Drives a certain amount, consuming gas.
	 * 
	 * @param distance the distance driven
	 */
	public void drive(double distance) {
		// WRITE YOUR CODE HERE
		gas-=(distance/efficiency);
	}

	/**
	 * Gets the amount of gas left in the tank.
	 * 
	 * @return the amount of gas
	 */

	public double getGasInTank() {
		// WRITE YOUR CODE HERE
		return gas; // FIX ME
	}
	
	public static void main(String[] args) {
		Car myHybrid = new Car(50.0); // make car get 50 miles per gallon
		myHybrid.addGas(20.0); // add 20 gallons of gas
		myHybrid.drive(100.0); // drive 100 miles 
		System.out.println(myHybrid.getGasInTank()); // should print 18.0
	}
}

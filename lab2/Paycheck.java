package labs.lab2;

/**
 * This class models a paycheck.
 */
public class Paycheck {
	// ADD YOUR INSTANCE VARIABLES HERE
	double wage, hoursWorked;
	/**
	 * Constructs a PayCheck for a given week.
	 * 
	 * @param wage       is the employee's hourly wage
	 * @param hoursWorked is the amount of hours worked
	 */
	public Paycheck(double wage, double hoursWorked) {
		// FILL IN
		this.wage = wage;
		this.hoursWorked = hoursWorked;
	}

	/**
	 * Gets the pay for this week
	 * 
	 * @return the pay, including overtime if earned
	 */
	public double getPay() {
		return (1.5*wage*(Math.max(0,hoursWorked-40)))+(wage*Math.min(hoursWorked, 40));
	}
	
	
	public static void main(String[] args) {
		Paycheck p1 = new Paycheck(10.5, 42);
		System.out.println(p1.getPay()); // 451.5
		Paycheck p2 = new Paycheck(20, 50);
		System.out.println(p2.getPay()); // 1100.0
		Paycheck p3 = new Paycheck(20, 39.5);
		System.out.println(p3.getPay()); // 790.0
	}
}
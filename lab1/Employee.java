package labs.lab1;

/**
 * An employee with a name and salary.
 */
public class Employee {
	private String name;
	private double salary;

	/**
	 * Constructs an employee.
	 * 
	 * @param employeeName  the employee name
	 * @param currentSalary the employee salary
	 */
	public Employee(String employeeName, double currentSalary) {
		this.name = employeeName;
		this.salary = currentSalary;
	}

	/**
	 * Gets the employee name.
	 * 
	 * @return the name
	 */
	public String getName() {
		// WRITE YOUR CODE HERE 
		return name; 
	}

	/**
	 * Gets the employee salary.
	 * 
	 * @return the salary
	 */
	public double getSalary() {
		// WRITE YOUR CODE HERE 
		return salary; 
	}

	/**
	 * Raises the salary by a given percentage.
	 * 
	 * @param percent the percentage of the raise
	 */
	public void raiseSalary(double percent) {
		// WRITE YOUR CODE HERE 
		
		salary*=(1+percent);
	}
	
	public static void main(String[] args) {
		Employee robert = new Employee("Robert Navarro", 100000);
		robert.raiseSalary(10); // Robert gets a 10% raise
		System.out.println(robert.getSalary()); // should print 110000.0
	}
}

package labs.lab2;

/**
 * This class determines if a year is a leap year or not.
 */
public class Year {
	// ADD YOUR INSTANCE VARIABLES HERE
	int year;
	/**
	 * Creates a Year object to test whether a particular year is a leap year.
	 * 
	 * @param aYear is the year to be tested
	 */
	public Year(int aYear) {
		// FILL IN
		this.year = aYear;
	}

	/**
	 * Method to determine if a year is a leap year.
	 * 
	 * @return boolean true year is a leap year
	 */
	public boolean isLeapYear() {
		if(year % 4 == 0){
			if(year>1582) {
				return (year%100==0)?(year%400==0):true;
			}else {
				return true;
			}	
        }
		return false;
	}
	
	public static void main(String[] args) {
		Year y = new Year(1980);
		System.out.println(y.isLeapYear()); // true
		y = new Year(1900);
		System.out.println(y.isLeapYear()); // false
		y = new Year(1500);
		System.out.println(y.isLeapYear()); // true
		y = new Year(1501);
		System.out.println(y.isLeapYear()); // false
	}
}

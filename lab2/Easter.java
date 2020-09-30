package labs.lab2;

public class Easter {
	private int n;
	private int p;

	/**
	 * Constructs the date of Easter Sunday.
	 */
	public Easter(int year) {
		// FILL IN
		//Let y be the year (such as 1800 or 2001). 
		//Divide y by 19 and name the remainder a. Ignore the quotient. 
		int a = year%19;
		//Divide y by 100 to get quotient b and remainder c.
		int b = year/100;
		int c = year%100;
		//Divide b by 4 to get quotient d and remainder e.
		int d = b/4;
		int e = b%4;
		//Divide 8 * b + 13 by 25 to get quotient g. Ignore the remainder.
		int g = (8 * b + 13)/25;
		//Divide 19 * a + b - d - g + 15 by 30 to get remainder h. Ignore the quotient.
		int h = (19 * a + b - d - g + 15)%30;
		//Divide c by 4 to get quotient j and remainder k.
		int j = c/4;
		int k = c%4;
		//Divide a + 11 * h by 319 to get quotient m. Ignore the remainder.
		int m = (a + 11 * h)/319;
		//Divide 2 * e + 2 * j - k - h + m + 32 by 7 to get remainder r. Ignore the quotient.
		int r = (2 * e + 2 * j - k - h + m + 32)%7;
		//Divide h - m + r + 90 by 25 to get quotient n. Ignore the remainder.
		this.n = (h - m + r + 90)/25;
		//Divide h - m + r + n + 19 by 32 to get remainder p. Ignore the quotient.
		this.p = (h - m + r + n + 19)%32;
	}

	/**
	 * Gets the month of Easter Sunday
	 * 
	 * @return month of Easter Sunday
	 */
	public int getEasterSundayMonth() {
		// FILL IN
		return n;
	}

	/**
	 * Gets the date of Easter Sunday
	 * 
	 * @return date of Easter Sunday
	 */
	public int getEasterSundayDay() {
		// FILL IN
		return p; // FIX ME
	}
	
	public static void main(String[] args) {
		Easter myEaster = new Easter(2001);
		System.out.println("Month: " + myEaster.getEasterSundayMonth()); // 4
		System.out.println("Day: " + myEaster.getEasterSundayDay()); // 15
	}
}
package labs.lab3;

public class ArrayBarChart {

	private int[] bars;
	// Constructor that sets up this ArrayBarChart object with the given array.
	public ArrayBarChart(int[] arr) {
		this.bars = new int[arr.length];
		int max = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			bars[i] = (int)(10*(double)arr[i]/max + 0.5);	
		}
	}
	// Prints the bar chart to the console
	public void printBarChart() {
		for(int i = 0; i<bars.length; i++) {
			System.out.print(i+": ");
			for(int j = 0;j<bars[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// Returns the number of asterisks to print for the given index
	public int getNumAsterisks(int index) {
		return bars[index];
	}
	
	
	public static void main(String[] args) {
		ArrayBarChart chart1 = new ArrayBarChart(new int[] {88, 14, 20, 25, 43, 100});
		chart1.printBarChart(); 
		/* prints:
		0: *********
		1: *
		2: **
		3: ***
		4: ****
		5: **********
		*/
		System.out.println(chart1.getNumAsterisks(0)); // returns 9
		System.out.println(chart1.getNumAsterisks(2)); // returns 2
		System.out.println(chart1.getNumAsterisks(5)); // returns 10

		 

		ArrayBarChart chart2 = new ArrayBarChart(new int[] {8, 8, 3, 3, 1, 0, 2, 4, 12});
		chart2.printBarChart(); 
		/* prints:
		0: *******
		1: *******
		2: ***
		3: ***
		4: *
		5:
		6: **
		7: ***
		8: **********
		*/
		System.out.println(chart2.getNumAsterisks(0)); // returns 7
		System.out.println(chart2.getNumAsterisks(2)); // returns 3
		System.out.println(chart2.getNumAsterisks(5)); // returns 0
	}
}

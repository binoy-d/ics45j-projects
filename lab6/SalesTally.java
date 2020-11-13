package labs.lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SalesTally {
	
	ArrayList<Sale> sales;
	// Constructor that creates a SalesTally object based on the given file
	public SalesTally(String salesFileName)  {
		sales = new ArrayList<Sale>();
		try(Scanner in = new Scanner(new File(salesFileName))){
			
			while(in.hasNextLine()) {
				String[] line = in.nextLine().split(";");
				sales.add(new Sale(line[0], line[1], Double.parseDouble(line[2]), line[3]));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File: "+salesFileName+" not found");
		}
	}
	
	// returns the total amount of sales for the given category
	public double getCategoryTotal(String category) {
		double total = 0;
		for(Sale s :sales) {
			if(s.getServiceCategory().equals(category)) {
				total+=s.getAmount();
			}
		}
		return total;
	}
	
	public static void main(String[] args) {
		SalesTally st = new SalesTally("./src/labs/lab6/sales.txt");
		System.out.println(st.getCategoryTotal("Dinner")); // prints 53.4
		System.out.println(st.getCategoryTotal("Conference")); // prints 499.0
		System.out.println(st.getCategoryTotal("Loding")); // prints 0.0
	}
}

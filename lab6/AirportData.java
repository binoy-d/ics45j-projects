package labs.lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class AirportData {
	
	
	Hashtable<String, ArrayList<String>> data;
	
	// Constructor that creates an AirportData object using the specified data file
	public AirportData(String dataFileName) {
		data = new Hashtable<String, ArrayList<String>>();
		try(Scanner in = new Scanner(new File(dataFileName))){
			while(in.hasNextLine()) {
				String[] line = in.nextLine().split(",");
				String airport = line[1].substring(1, line[1].length()-1);
				String city = line[2].substring(1, line[2].length()-1);
				
				if(data.containsKey(city)) {
					ArrayList<String> airports = new ArrayList<String>();
					airports.addAll(data.get(city));
					airports.add(airport);
					data.put(city,airports);
					
				}else {
					ArrayList<String> airports = new ArrayList<String>();
					airports.add(airport);
					data.put(city, airports);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File: "+dataFileName+" not found");
		}
	}
	
	
	// Returns an ArrayList of all airport names in the given city
	public ArrayList<String> getAllAirportsInCity(String cityName) {
		if(!data.containsKey(cityName)) {
			return new ArrayList<String>();
		}
		return data.get(cityName);
	}
	
	public static void main(String[] args) {
		AirportData ad = new AirportData("./src/labs/lab6/airports.dat");
		ArrayList<String> airports = ad.getAllAirportsInCity("Seoul");
		System.out.println(airports); // prints [Gimpo International Airport, Incheon International Airport]
		airports = ad.getAllAirportsInCity("Irvine");
		System.out.println(airports); // prints []
	}
	
}

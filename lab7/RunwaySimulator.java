package labs.lab7;

import java.util.LinkedList;
import java.util.Queue;

public class RunwaySimulator {
	 // holds the planes waiting to take off
	private Queue<String> takingOff;
	// holds the planes waiting to land
	private Queue<String> landing; 
	
	// constructor
	public RunwaySimulator() {
		takingOff = new LinkedList<String>();
		landing = new LinkedList<String>();
	}
	
	// adds a plane to the taking off queue
	public void addTakeOff(String flightSymbol) {
		takingOff.add(flightSymbol);
	}
	
	// adds a plane to the landing queue
	public void addLanding(String flightSymbol) {
		landing.add(flightSymbol);
	}
	
	// returns a String describing the next action. If there is no next action, just returns an empty String.
	public String handleNextAction() {
		if(!landing.isEmpty()) {
			return landing.remove() + " landing";					
		}else if(!takingOff.isEmpty()) {
			return takingOff.remove() + " taking off";
		}else {
			return "";
		}
		
		
	}
}

package labs.lab7;

import java.util.Map;
import java.util.TreeMap;

public class Gradebook {
	// holds the names and grades
	private Map<String, String> grades; 
	
	// constructor
	public Gradebook() {
		grades = new TreeMap<String, String>();
	}
	
	// adds a new entry (if the name already exists in the grade book, it overwrites the old grade with the new one)
	public void addEntry(String name, String grade) {
		grades.put(name, grade);
	}
	
	// removes the entry for the name if it exists 
	public void removeEntry(String name) {
		if(grades.containsKey(name)) {
			grades.remove(name);
		}
	}
	
	// modifies the entry for the given name (if it exists)
	public void modifyEntry(String name, String grade) {
		grades.put(name, grade);
	}
	
	// returns an array of strings representing the gradebook. See example for format.
	public String[] getEntries() {
		String[] out = new String[grades.size()];
		int i = 0;
		for(String name:grades.keySet()) {
			out[i] =name+" "+grades.get(name);
			i++;
		}
		return out;
	}
}

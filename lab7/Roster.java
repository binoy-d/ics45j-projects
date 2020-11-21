package labs.lab7;

import java.util.ArrayList;
import java.util.Collections;

public class Roster {
	
	ArrayList<Person> ppl;
	
	// constructs a Roster
	public Roster() {
		ppl = new ArrayList<Person>();
	}
	
	// adds a Person with the given id and name to the roster
	public void addPerson(int id, String name) {
		ppl.add(new Person(id, name));
	}
	
	
	// if a Person with the given name is found, removes the first Person with this name from the roster and returns true; if not found, returns false.
	public boolean removePerson(String name) {
		int index = -1;
		for(int i = 0; i<ppl.size(); i++) {
			if(ppl.get(i).getName() == name) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			return false;
		}
		ppl.remove(index);
		return true;
	}
	
	// if a Person with the given id is found, removes the first Person with this id from the roster and returns true; if not found, returns false
	public boolean removePerson(int id) {
		int index = -1;
		for(int i = 0; i<ppl.size(); i++) {
			if(ppl.get(i).getId() == id) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			return false;
		}
		ppl.remove(index);
		return true;
	}
	
	// if a Person with the given name is found, returns the first Person with this name; if not found, returns null
	public Person findPerson(String name) {
		for(int i = 0; i<ppl.size(); i++) {
			if(ppl.get(i).getName() == name) {
				return ppl.get(i);
			}
		}
		return null;
	}
	
	
	// if a Person with the given id is found, returns the first Person with this id; if not found, returns null
	public Person findPerson(int id) {
		for(int i = 0; i<ppl.size(); i++) {
			if(ppl.get(i).getId() == id) {
				return ppl.get(i);
			}
		}
		return null;
	}
	
	// returns a String containing the names of all Persons in the roster, in ascending alphabetical order, with a space in between each name
	public String getNamesInAlphaOrder() {
		String out = "";
		Collections.sort(ppl);
		for(Person p : ppl) {
			out+=p.getName()+" ";
		}
		return out.substring(0, out.length()-2);
	}
	
}

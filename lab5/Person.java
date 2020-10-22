package labs.lab5;

public abstract class Person implements Comparable{
	private String name;
	
	// constructor that instantiates the Person's name
	public Person(String name) {
		this.name = name;
	}
	
	
	// returns the Person's name
	public String getName() {
		return name;
	}
	
	// compares by name
	public int compareTo(Object otherPerson) {
		Person other = (Person)otherPerson;
		return name.compareTo(other.name);
	}
}

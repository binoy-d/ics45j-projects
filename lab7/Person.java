package labs.lab7;

public class Person implements Comparable {
	private String name;
	private int id;
	// constructs a Person with the given id and name
	public Person(int id, String name) {
		this.name = name;
		this.id = id;
	}
	
	// returns name of the Person
	public String getName() {
		return name;
	}
	
	// returns id of the Person
	public int getId() {
		return id;
	}
	
	
	// implements this method declared by the Comparable interface
	public int compareTo(Object otherObject) {
		Person p = (Person) otherObject;
		return name.compareTo(p.getName());
	}

}

package labs.lab7;

public class Task implements Comparable{
	private int priority;
	private String description;
	// constructor
	public Task(int priority, String description) {
		this.priority = priority;
		this.description = description;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public String getDescription() {
		return description;
	}
	
	// overrides the compareTo from the Comparable interface (Task must implement Comparable)
	public int compareTo(Object otherObject) {
		Task t = (Task)otherObject;
		Integer p = priority;
		return p.compareTo(t.getPriority());
	}
}

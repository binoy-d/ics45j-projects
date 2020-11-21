package labs.lab7;

import java.util.PriorityQueue;

public class ToDoList {
	
	// holds the tasks in the to do list
	private PriorityQueue<Task> tasks; 
	
	// constructor
	public ToDoList() {
		tasks = new PriorityQueue<Task>();
	}
	
	// adds a new task with the given priority and description
	public void addTask(int priority, String description) {
		tasks.add(new Task(priority, description));
	}
	
	// returns the next highest priority task; if two tasks have the same priority, return either one
	public Task nextTask() {
		if(tasks.isEmpty()) {
			return null;
		}
		return tasks.remove();
	}
}

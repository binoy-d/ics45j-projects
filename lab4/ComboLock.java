package labs.lab4;

public class ComboLock {
	
	//this is kinda extra but screw it lol
	public static final boolean LEFT = true;
	public static final boolean RIGHT = false;
	
	private int num1;
	private int num2;
	private int num3;
	private int dialPosition;
	
	private int n1;
	private int n2;
	private int n3;
	private boolean direction;
	
	private int state;
	/*
	 * Constructor that initializes the combination of the lock;
	 * assume all inputs are valid ints >= 0 && <= 39
		 *  num1 = first number in combo (turn right to it)
		 *  num2 = second number in combo (turn left to it)
		 *  num3 = third number in combo (turn right to it)
	 */
	public ComboLock(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.n1 = 0;
		this.n2 = 0;
		this.n3 = 0;
		this.dialPosition = 0;
		this.direction = LEFT;
		this.state = 0;
	}
	// Resets the state of the lock so it can be opened again; resets the dial so that it points to 0
	public void reset() {
		dialPosition = 0;
	}
	// Turns lock left given number of ticks; assume all inputs are valid ints >= 0 && <= 39
	public void turnLeft(int ticks) {
		//if we switched directions
		if(direction == RIGHT) {
			state++;
			direction = LEFT;
		}
		dialPosition+=ticks;
		if(dialPosition>39) {
			dialPosition-=40;
		}
		updateInput();
	}
	
	// Turns lock left given number of ticks; assume all inputs are valid ints >= 0 && <= 39
	public void turnRight(int ticks) {
		//if we switched directions
		if(direction == LEFT) {
			state++;
			direction = RIGHT;
		}
		
		dialPosition-=ticks;
		if(dialPosition<0) {
			dialPosition+=40;
		}
		updateInput();
		
	}
	
	//called after a number is inputted
	private void updateInput() {
		if(state == 1) {
			n1 = dialPosition;
		}else if(state == 2) {
			n2 = dialPosition;
		}else if(state == 3) {
			n3 = dialPosition;
		}
	}
	
	
	
	// Returns true if the lock can be opened now
	public boolean open() {
		return state == 3 && n1==num1 && n2 == num2 && n3==num3;
	}
	
	
	public static void main(String[] args) {
		ComboLock lock = new ComboLock(38, 14, 7);
		lock.turnRight(2);
		lock.turnLeft(16);
		lock.turnRight(7);
		System.out.println(lock.open()); // returns true
		lock.reset();
		lock.turnRight(2);
		lock.turnLeft(21);
		lock.turnRight(7);
		System.out.println(lock.open()); // returns false
	}
}

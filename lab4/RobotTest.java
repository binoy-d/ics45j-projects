package labs.lab4;

import java.awt.Point;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RobotTest {

	@Test
    public void testConstructor() {
		// FILL IN
		Robot r = new Robot();
		assertEquals(r.getLocation(), new Point(0, 0));
		assertEquals(r.getDirection(), "N");
    }

	@Test
    public void testTurnLeft() {
		// FILL IN
		Robot r = new Robot();
		assertEquals(r.getDirection(), "N");
		r.turnLeft();
		assertEquals(r.getDirection(), "W");
		r.turnLeft();
		assertEquals(r.getDirection(), "S");
		r.turnLeft();
		assertEquals(r.getDirection(), "E");
		r.turnLeft();
		assertEquals(r.getDirection(), "N");

	}
	
	@Test
    public void testTurnRight() {
		// FILL IN
		Robot r = new Robot();
		assertEquals(r.getDirection(), "N");
		r.turnRight();
		assertEquals(r.getDirection(), "E");
		r.turnRight();
		assertEquals(r.getDirection(), "S");
		r.turnRight();
		assertEquals(r.getDirection(), "W");
		r.turnRight();
		assertEquals(r.getDirection(), "N");
    }
	
	@Test
    public void testMove() {
		// FILL IN
		Robot r = new Robot();//facing north
		assertEquals(r.getLocation(), new Point(0, 0));
		assertTrue(r.move());
		assertEquals(r.getLocation(), new Point(0, 1));
		assertTrue(r.move());
		assertEquals(r.getLocation(), new Point(0, 2));
		assertTrue(r.move());
		assertEquals(r.getLocation(), new Point(0, 3));
		assertTrue(r.move());
		assertEquals(r.getLocation(), new Point(0, 4));
		r.turnRight();//facing east
		assertEquals(r.getLocation(), new Point(0, 4));
		assertTrue(r.move());
		assertEquals(r.getLocation(), new Point(1, 4));
		assertTrue(r.move());
		assertEquals(r.getLocation(), new Point(2, 4));
		assertTrue(r.move());
		assertEquals(r.getLocation(), new Point(3, 4));
		assertTrue(r.move());
		assertEquals(r.getLocation(), new Point(4, 4));
		assertTrue(r.move());
		assertEquals(r.getLocation(), new Point(5, 4));
		assertFalse(r.move());
		assertEquals(r.getLocation(), new Point(6, 4));
		r.turnRight(); //facing south now
		assertFalse(r.move());
		assertEquals(r.getLocation(), new Point(6, 3));
		assertFalse(r.move());
		assertEquals(r.getLocation(), new Point(6, 2));
    }
	
	@Test
    public void testGetLocation() {
		// FILL INRobot r = new Robot();
		Robot r = new Robot();
		assertEquals(r.getLocation(), new Point(0, 0));
		r.move();
		assertEquals(r.getLocation(), new Point(0, 1));
    }
	
	@Test
    public void testGetDirection() {
		// FILL IN
		Robot r = new Robot();
		assertEquals(r.getDirection(), "N");
		r.turnRight();
		assertEquals(r.getDirection(), "E");
		r.turnLeft();
		assertEquals(r.getDirection(), "N");
    }
}

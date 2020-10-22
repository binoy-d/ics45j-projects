package labs.lab5;

import java.awt.Rectangle;

public class PerimeterMeasurer implements Measurer{
	
	public double measure(Object anObject) {
		Rectangle other = (Rectangle)anObject;
		return (other.getWidth()*2)+(other.getHeight()*2);
	}
}

package labs.lab5;

public class PerimeterFilter implements Filter{
	public boolean accept(Object anObject) {
		Measurer m = new PerimeterMeasurer();
		return m.measure(anObject)<=100; 
	}
}

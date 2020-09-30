package labs.lab2;

public class Triangle {
	private double x1, y1, x2, y2, x3, y3;

	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
	}

	private double getDistance(double a1, double b1, double a2, double b2) {
		return Math.sqrt(Math.pow((a1-a2), 2)+Math.pow((b1-b2), 2));
	}

	private double getAngle(double a, double b, double c) {
		return Math.acos((-(c*c)+(a*a)+(b*b))/(2.0*a*b));
	}
	public double getSide1Length() {
		// FILL IN
		return getDistance(x1, y1, x2, y2);
	}

	public double getSide2Length() {
		// FILL IN
		return getDistance(x1, y1, x3, y3);
	}

	public double getSide3Length() {
		// FILL IN
		return getDistance(x2, y2, x3, y3);
	}

	public double getAngle1() {
		// FILL IN
		return getAngle(getSide1Length(), getSide2Length(), getSide3Length());
	}

	public double getAngle2() {
		// FILL IN
		return getAngle(getSide3Length(), getSide1Length(), getSide2Length());
	}

	public double getAngle3() {
		// FILL IN
		return getAngle(getSide2Length(), getSide3Length(), getSide1Length());
	}

	public double getPerimeter() {
		// FILL IN
		return getSide1Length()+getSide2Length()+getSide3Length();
	}

	public double getArea() {
		// FILL IN
		double p = getPerimeter()/2;
		return Math.sqrt(p*(p-getSide1Length())*(p-getSide2Length())*(p-getSide3Length()));
	}
	
	public static void main(String[] args) {
		Triangle triangle = new Triangle(0, 5, 1.5, 2, 8, 25.92);
		System.out.println(triangle.getSide1Length()); // 3.3541019662496847
		System.out.println(triangle.getSide2Length()); // 22.39746414217467
		System.out.println(triangle.getSide3Length()); // 24.787424230847385
		System.out.println(triangle.getAngle1()); // 2.312694531902217
		System.out.println(triangle.getAngle2()); // 0.7289796952097912
		System.out.println(triangle.getAngle3()); // 0.09991842647778622
		System.out.println(triangle.getPerimeter()); // 50.53899033927174
		System.out.println(triangle.getArea()); // 27.690000000000044  
	}
}
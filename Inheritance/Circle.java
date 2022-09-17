package Inheritance;

public class  Circle extends Shape   {
	private static final double  PI = 3.14;
	private int radius;

	public Circle() {}
	public Circle(int t) {
		radius=t;
		
	}
	
	
	public double area() {
		double area=(PI*radius*radius);
		System.out.println("area of circle=" + area);
		return area;
	}
}

package Inheritance;

public class Triangle extends Shape {
	private int base;
	private int height;
	
	//public Triangle() {}
	public Triangle (int b , int h) {
		base=b;
		height=h;
		
		
	}
	public double area() {
		double area = (base*height*1/2);
				System.out.println(area);
		return area;
	}
	

}

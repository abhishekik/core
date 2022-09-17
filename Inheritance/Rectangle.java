package Inheritance;

public class Rectangle extends Shape{
	private int length;
	private int width;

//	public Rectangle() {}
	public Rectangle(int i , int s) {
	
	length=i;
	width=s;
	}
	public double area() {
		double area = (length*width);
		System.out.println(area);
		return area;
	}
}

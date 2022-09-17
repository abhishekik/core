package Polymorphism;

public class Shape {
	private String color;
	private int borderwidth;
	public static final double pi=3.14;
	
	public Shape() {}
	public Shape (String c , int b) {
		color = c;
		borderwidth = b ;
		
	}
	
	public String getcolor() {
		return color;
	}
	public int getborderwidth() {
		return borderwidth;
	}
	public double area() {
		return 0;
	}
	
	
	
	
	
	
	
}

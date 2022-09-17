package com.oop;

public class Circle extends Shape {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double area() {
		double d = 3.14 * radius * radius;
		//System.out.println("Circle Area = " + d);
		return d;
	}

}

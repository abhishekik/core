package com.oop;

public class TestCircle {
	public static void main(String[] args) {
	   Circle c = new Circle();
	   c.setColor("Blue");
	   c.setbroderwidth(7);
	   c.setRadius(3);
	   
	   
	   System.out.println(c.getColour());
	   System.out.println(c.getBroderwidth());
	   System.out.println(c.getRadius());
	   System.out.println(c.area());
	}

}

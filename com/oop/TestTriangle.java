package com.oop;

public class TestTriangle {
	public static void main(String[] args) {
		
	Triangle t = new Triangle();
	t.setBase(5);
	t.setHight(8);
	
	System.out.println(t.getBase());
	System.out.println(t.getHight());
	System.out.println(t.area());
	}

}

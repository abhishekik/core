package com.oop;

public class TestShape {
	public static void main(String[] args) {
		/*Shape s = new Shape();

		Circle c = (Circle) s.getShape(1);
		c.setRadius(10);

		Rectangle r = (Rectangle) s.getShape(2);
		r.setLength(10);
		r.setWidth(10);

		Triangle t = (Triangle) s.getShape(3);
		t.setBase(10);
		t.setHight(10);

		c.area();
		r.area();
		t.area();*/
		
		
		Shape s1 = new Shape();
		Circle c1 = (Circle) s1.getShape1(1);
		c1.setRadius(5);
		Rectangle r1 = (Rectangle) s1.getShape1(2);
		r1.setLength(12);
		r1.setWidth(12);
		Triangle t1 = (Triangle) s1.getShape1(3);
		t1.setBase(12);
		t1.setHight(12);
		
		c1.area();
		r1.area();
		t1.area();
	}
}

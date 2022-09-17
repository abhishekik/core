package com.oop;

public class Shape {
	private String Colour;
	private int broderwidth;

	public void setColor(String c) {

		Colour = c;

	}

	public String getColour() {
		return Colour;
	}

	public void setbroderwidth(int i) {
		broderwidth = i;

	}

	public int getBroderwidth() {
		return broderwidth;
	}

//	public Shape getShape(int i) {
//
//		if (i == 1) {
//			return new Circle();
//		}
//		if (i == 2) {
//			return new Rectangle();
//		}
//		if (i == 3) {
//			return new Triangle();
//		} 
//		return new Shape();

	
	public Shape getShape1(int j) {
		if (j==1) {
			return new Circle();
		}
		if (j==2) {
			return new Rectangle();
		}
		if(j==3) {
			return new Triangle();
		}
		Shape s = new Shape();
		return s;
	}

}

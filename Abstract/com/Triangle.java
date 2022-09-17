package Abstract.com;

public class Triangle extends Shape {
	private int base;
	private int height;
	
	public Triangle() {}
	public Triangle (int b , int h) {
		base=b;
		height=h;
		
		
	}
	@Override
	public double area() {
		double area = (base*height) / 2;
		System.out.println(area);
		return 0;
	}
	
	}



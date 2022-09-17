package Inheritance;

public class TestShape {
public static void main(String[] args) {
	
	/*Circle s = new Circle(6);
	Rectangle r=new Rectangle(4,9);
	Triangle t=new Triangle(5,7);
	
	r.area();
	r.setColor("blue");
	r.setBroderwidth(6);
	s.area();
	t.area();
	System.out.println(r.getBroderwidth());
	System.out.println(r.getColor());
}
}*/
	double totalarea=0;
	Shape[] v=new Shape[3];
	v[0]=new Circle(6);
	v[1]=new Rectangle(5,6);
	v[3]=new Triangle(4,8);
	for (int i = 0; i<v.length; i++) {
		System.out.println(v[i].area);
		totalarea=v[i].area;
		System.out.println(totalarea);
	}
}

}
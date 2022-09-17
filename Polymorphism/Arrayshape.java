package Polymorphism;

public class Arrayshape {
public static void main(String[] args) {
	
	//double totalarea=0;
	Shape[] s = new Shape[3];
	s[0] = new Circle(5);
	s[1]= new Rectangle(6,7);
	s[2]=new Triangle(4,8);
	
	double sum = 0;
	for (int i = 0; i<s.length; i++) {
		
		// System.out.println(s[i].area());
		sum = sum + s[i].area();
		System.out.println(sum);
	}System.out.println(sum);
	
}

}




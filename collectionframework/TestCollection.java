package collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestCollection {
	public static void main(String[] args) {
		
		List l = new ArrayList<>();
		
		l.add(43);
		l.add(63);
		l.add("abhi");
		l.add(7.6);
		//l.clear();
	
		
		System.out.println(l);
		
		List a = new LinkedList();
		
    a.add(5);
	a.add(78);
	a.add(67);
	a.add("abhi");
	//a.addAll(l);	
	//a.clear();
	//a.contains(a);
	//a.isEmpty();
	 
	System.err.println(  a );
	
	System.out.println(l.contains("abhi"));
	
	
	
	
	}
	
	

}

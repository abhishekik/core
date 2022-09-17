package collectionframework;


import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Testset {
	
	public static void main(String[] args) {
		
		
		Set s = new TreeSet();//tree set = acending order
		
		s.add(2);
		s.add(14);
		s.add(34);
		s.add(28);
		s.add(10);
	    
				
		System.err.println(s);

		HashSet s1 = new HashSet();//random does not follow any order
		
		s1.add(3);
		s1.add(12);
		s1.add(1);
		s1.add(33);
		s1.add(4);
       // s1.addAll(s);
		
		
		Iterator i = s1.iterator();
		
		while (i.hasNext()){
			int s2 = (int) i.next();
			
			System.err.println(s2);
		}
		
		
		
		System.err.println(s1);
		
		
		
		
		
	}

}

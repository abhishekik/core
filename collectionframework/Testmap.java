package collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Testmap {
	
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put(0, 3);
		m.put(1, 23);
		m.put(2, 33);
		m.put(3, 13);
		//m.putAll(m);
		//m.clear();
		m.put(3, 3);
      

		System.err.println(m);
				
				
				Map m1 = new TreeMap();
				
				m1.put(1, "abhi");
				m1.put(2, "mishra");
				m1.put(3, "birsinghpur");
				m1.put(4, "satna");
				m1.put(5, "mp");
				m1.put(2, "mish");
			
				
				System.err.println(m1);
	           System.err.println(m1.containsKey(5));
	           System.err.println(m1.containsValue("mp"));
	           System.err.println(m1.entrySet());
	           System.err.println(m1.keySet());
	           System.err.println(m.isEmpty());
	
	         Map h = new HashMap();
	         
	            h.put(0, "kaju");
				h.put(1, "mishra");
				h.put(2, "badera");
				h.put(3, "satna");
			   h. put(4, "mp");
			   
			   System.err.println(h);
			   System.err.println(h.hashCode());
			  // System.err.println();
			  // System.err.println();
			  // System.err.println(); 
			   
			   Map s = new LinkedHashMap();
			   
			   s.put(1, 12);
			   s.put(2, 32);
			   s.put(3, 22);
			   s.put(4, 2);
			   //s.equals(h);
			   //s.putAll(h);
			   s.replace(4, "up");
			   s.replace(2, 32, "shivam");
			   s.put(1, 1);
			  
	   
	          System.err.println(s);
	          System.err.println(s.equals(h));
	          System.err.println(s.get(4));
	          System.err.println(s.isEmpty());
	          System.err.println(s.size());
	System.err.println(s.hashCode());
	
	
	
	}

}

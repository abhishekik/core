package collectionframework;

import java.util.Hashtable;
import java.util.Map;

public class TestHashtable {
public static void main(String[] args) {
	
	
	Hashtable m = new Hashtable();
  
	m.put(0, "name");
	m.put(1, "abhi");
	m.put(2, "mishra");
	m.put(3, "satna");
	m.put(4, "satna");
	
	
	  
	System.err.println(m);
	System.err.println(m.hashCode());
	System.err.println(m.size());
	
	
}
}

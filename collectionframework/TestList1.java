package collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class TestList1 {
	public static void main(String[] args) {
		
		Collection c =new ArrayList();
		
		c.add("kalpu");
		c.add("abhi");
		c.add("mansi");
	
		System.err.println("length of Collection:"  + c.size()  );
		
		/*for(Object ele : c);{
			
			System.err.println(c);
			
		}*/
		
		Object []  Array = c.toArray();
		
		for (Object ele: Array) {
			String s = (String)ele;
			
			System.err.println(s);
		}
	
		
	}

}

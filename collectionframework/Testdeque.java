package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;

public class Testdeque { 
	
	public static void main(String[] args) {
		
		
		
      Deque d = new ArrayDeque();
		
		d.add(34);
		d.add(4);
		d.add("aman");
		d.addFirst("mishra");
		d.addLast("mp");
		
		
		System.err.println(d);
		
		//System.err.println(d.remove());
		//System.err.println(d.remove());
		//System.err.println(d.removeAll(d));
		System.err.println(d.getFirst());
		System.err.println(d.getLast());
	}

}

package collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TestList {
	public static void main(String[] args) {
		
		List r = new ArrayList();
		
		r.add(0, 5);
		r.add(1, 56);
		r.add(2, 57);
		
		
		r.addAll(0, r);
		//r.addAll(1, r);
		r.addAll(2, r);
		//r.addAll(r);
		
		
		System.out.println(r);
		System.err.println(r.containsAll(r));
		
		
		
		


	}

	
}

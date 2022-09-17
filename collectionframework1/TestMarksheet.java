package collectionframework1;

import java.util.ArrayList;//import java.util.*
import java.util.Collections;
import java.util.Iterator;

public  class  TestMarksheet {
	
	public static void main(String[] args) {
		
		Marksheet m = new Marksheet();
		
		m.setRollno("1");
		m.setFname("ajay");
		m.setLname("mishra");
		m.setMat(95);
		m.setPhy(85);
		m.setChe(80);
		
		
		
		
     Marksheet m1 = new Marksheet();
		
		m1.setRollno("2");
		m1.setFname("ajay");
		m1.setLname("gupta");
		m1.setMat(85);
		m1.setPhy(65);
		m1.setChe(70);
		
		
		Marksheet m2= new Marksheet();

		m2.setRollno("3");
		m2.setFname("shivam");
		m2.setLname("solanki");
		m2.setMat(87);
		m2.setPhy(79);
		m2.setChe(77); 
		
		Marksheet m3 = new Marksheet();
		
		m3.setRollno("4");
		m3.setFname("ajay");
		m3.setLname("verma");
		m3.setMat(89);
		m3.setPhy(75);
		m3.setChe(79) ;
		
		Marksheet m4 = new Marksheet();
		
		m4.setRollno("5");
		m4.setFname("prashant");
		m4.setLname("meena");
		m4.setMat(88);
		m4.setPhy(68);
		m4.setChe(96);
		
		
		ArrayList a = new ArrayList();
		
		a.add(m);
		a.add(m1);
		a.add(m2);
		a.add(m3);
		a.add(m4);
		
		
	  Collections.sort(a);
	  /*Collections.sort(a, new Sortbyname());
	  Collections.sort(a, new Sortbylname());
	  Collections.sort(a, new Sortbyphy());
	  Collections.sort(a,new Sortbyche());
	  Collections.sort(a, new Sortbymat());*/
	  
	  Collections.sort(a, new Assighnment());
	  
	  
	  Iterator l = a.iterator();
	  while (l.hasNext()) {
		Marksheet b = (Marksheet) l.next();
		
		System.err.println(b.getRollno()+" "+b.getFname()+" "+b.getLname()+" "+b.getMat()+" "+b.getPhy()+" "+b.getChe());
		
		
	}
	  
	
		
	}

	
	}
	



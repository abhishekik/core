package clone;

public class Testcloning {
	public static void main(String[] args) throws  Exception {
		
		Employee a = new Employee();
		  
		a.setAddress("birsinghpur");
		a.setFname("abhishek");
		a.setId(786);
		a.setLname("mishra");
		
		Address d = new Address();
		d.setCity("birsinghpur");
		d.setPn(485226);
		d.setStreet(9);
	
		Employee e1 = (Employee)a.clone();
		Address e2 = (Address)d.clone();
		
		
		
		System.err.println(a.getFname());
		System.err.println(a.getLname());
		System.err.println(a.getId());
		System.err.println(a.getAddress());
		System.err.println(d.getCity());
		System.err.println(d.getPn());
		System.err.println(d.getStreet());
		
System.err.println(".........................");
		
        System.out.println(e1.getFname());
  		System.out.println(e1.getLname());
 		System.out.println(e1.getId());
		System.out.println(e1.getAddress());
        System.out.println(e2.getCity());
		System.out.println(e2.getPn());
		System.out.println(e2.getStreet());
		
		
		
		
		
	}
	
	
	
	

}

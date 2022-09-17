package Constractorcall;

public class Person {
	
     protected String fname;
     protected String address;
     protected String lname;
	/*public String getFname() {
		return fname;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getLname() {
		return lname;
	}*/
	
	  		
     public Person () {
    	 System.out.println("This is default constractor");
     }
     public Person(String fn,String ln) {
    	 this.fname=fn;
    	 this.lname=ln;
    	 System.out.println("2nd parameter" +  fn + ln );
     }
     public Person (String fn, String ln, String address) {
    	 this(fn , ln);
    	    this.address = address;
    	    System.out.println("3 parameter"+ fn + ln + address);
    	 
	}
      public static void main(String[] args) {
    	 Person p = new Person("abhishek" , "mishra", "satna");
		
	}
     
}

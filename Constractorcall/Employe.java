package Constractorcall;

public class Employe extends Person{
	private int ID;
	private String Designation;
	
	public Employe(String string) {
		System.out.println("employe default constractor");
	}
	public Employe(int i, String d,   String fn, String ln,String add ) {
		super(fn,ln);
		this.ID=i;
		this.Designation=d;
		System.out.println("5th constractor"+"  "+i+"  "+ d +"  " +fn +"  "+ ln + "  "+add);
		
	}
	public static void main(String[] args) {
		
		Employe e = new Employe(786,"app","abhishek","mishra","satna");
		 
			}
	

}

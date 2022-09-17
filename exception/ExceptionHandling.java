package exception;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		try {
			try {
				 String n=null;
		 	     System.err.println(n.length());
			 }catch( Exception n) {
				System.err.println("fgty");
			}
			String s=null;
			System.out.println(s.length());
		}
		
		catch
	    (Exception e) {
			try {
				double div = 15/0;
				System.err.println(div);
			}
			catch(Exception e1) {
				System.err.println("gffdgc");
				
			}
		System.err.println("you can not divide by zero");
		}
			
		finally {
			try {
				String b=null;
				System.err.println(b.length());
			}catch(Exception e2) {
				System.err.println("gjhidgqg");
			}
				System.err.println("pandit");
			}
		}
	}

	


		
			
	



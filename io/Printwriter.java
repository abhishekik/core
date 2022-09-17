package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Printwriter {
public static void main(String[] args) throws Exception {
	
	FileWriter f = new FileWriter("E:/nullfile.txt");
	PrintWriter p = new PrintWriter(f);
//		p.println(i+":mis");
//		p.println(i+":satna");
//		p.println(i+":bus");
//		p.println(i+":stand");
//		p.println(i+":indore");
	
	    p.println("ajay");
	    p.println("ajay");
	    p.println("ajay");
	    p.println("ajay");
	    p.println("ajay");
	    
	    f.close();
		p.close();
		
		System.out.println("done");
	    
	}
	//f.close();
//	p.close();
	
	//System.err.println("done");
}


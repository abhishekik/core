package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Readlinebyline {
	public static void main(String[] args) throws Exception {
		
		FileReader r = new FileReader("E:/satna.txt");
		BufferedReader in = new BufferedReader(r);
		
		String s = in.readLine();
		while(s != null) {
			System.out.println(s);
			
			s = in.readLine();
		}
		
		in.close();
	
	}
      
}

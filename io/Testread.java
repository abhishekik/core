package io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Testread {
	
	public static void main(String[] args) throws Exception {
		
		FileReader in = new FileReader("E:/abhi.txt");
		
		int ch = in.read();
		while (ch!= -1) {
			System.err.println((char)ch);
			
			ch=in.read();
		}
		in.close();
	}

}

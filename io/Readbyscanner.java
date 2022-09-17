package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Readbyscanner {
	
	public static void main(String[] args) throws Exception {
		
		FileReader in = new FileReader("E:/satna.txt");
		Scanner n = new Scanner(in);
		
		while (n.hasNext()) {
		System.err.println(n.nextLine());
			
		}
		in.close();
	}

}

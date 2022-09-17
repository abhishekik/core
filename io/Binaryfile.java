package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Binaryfile {
	public static void main(String[] args) throws IOException {
		
		
		//InputStreamReader f = new InputStreamReader(System.in);
		FileInputStream f = new FileInputStream("E:/satna.txt");
		FileOutputStream out = new FileOutputStream("E:/satn.txt");
		
		int l = f.read();
		while (l != -1) {
			out.write(l);
			l = f.read();
		}
			System.out.println("done");
			f.close();
			out.close();
		}
	
	
	}  
    



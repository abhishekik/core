package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Testbykeyboard {
public static void main(String[] args) throws Exception {
	
	InputStreamReader i = new InputStreamReader(System.in);
	BufferedReader b = new BufferedReader(i);
	
	PrintWriter p = new PrintWriter("E:/satn.txt");
	
	String Line = b.readLine();
	while(!Line.equals("quit")){
     p.println(Line);
     Line=b.readLine();
	}
     b.close();
     p.close();
		
	
	
	
}
}
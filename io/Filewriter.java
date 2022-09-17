package io;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
	public static void main(String[] args) throws Exception {
		
		FileWriter fi = new FileWriter("E:/nullfile.txt");
		
		fi.write("a");
		fi.write('\n');
		fi.write("abhi");
		fi.write("raliha");
		fi.write("busstand");
		fi.write("indore");
		fi.close();
		System.err.println("Check E:/nullfile.txt");
		
		
	}

}

package com.readWriteFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("D:\\MyCoreJava\\Practise\\src\\com\\demo\\Test123.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Salenium with Java");
		bw.write("Salenium with C++");
		bw.write("Salenium with python");
		
		System.out.println("Finished!!....");
		bw.close();
	}

}

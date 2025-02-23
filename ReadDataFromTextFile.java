package com.readWriteFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		
	//Approach1: Using FileReader BufferReader
		/*FileReader fr = new FileReader("D:\\MyCoreJava\\Practise\\src\\com\\demo\\Test123.txt");
        BufferedReader br = new BufferedReader(fr);
        
        String str;
        while((str = br.readLine())!=null)
        {
        	System.out.println(str);
        }
        br.close(); */
		
		//Approach2: Using Scanner & File
		File file = new File("D:\\MyCoreJava\\Practise\\src\\com\\demo\\Test123.txt");
		Scanner sc = new Scanner(file);
		
		//loop statement
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}

}

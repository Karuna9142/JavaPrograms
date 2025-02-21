package com.demo.basic;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String - ");
		String str = sc.nextLine();
		
		//String rev = "";
		System.out.println("Original String is - "+str);
		
		//first way
//		for(int i = str.length()-1; i>=0; i--)
//		{
//			rev += str.charAt(i);
//		}
//		System.out.println("Reverse String is - "+rev);
		
		
		//second way
//		char a[] = str.toCharArray();
//		for(int i = str.length()-1; i>=0; i--)
//		{
//			rev = rev+a[i];
//		}
//		System.out.println("Reversed String is - "+rev);

		StringBuffer sb = new StringBuffer(str);
		StringBuffer rev = sb.reverse();
		System.out.println("Reverse String is - "+rev);
	}

}

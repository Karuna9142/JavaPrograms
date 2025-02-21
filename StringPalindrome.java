package com.demo.basic;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String - ");
		String str = sc.nextLine();
		
		String org1 = str;
		String rev ="";
		
		for(int i = str.length()-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		if(org1.equals(rev))
		{
			System.out.println(org1+ " is Palindrome");
		}
		else
		{
			System.out.println(org1+ " is not Palindrome");
		}
		

	}

}

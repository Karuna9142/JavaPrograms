package com.method;

import java.util.Scanner;

public class Punctuation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:- ");
		String str = sc.nextLine();
		
		int count = 0;
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i)==',' || str.charAt(i)=='?' ||str.charAt(i)==';' ||str.charAt(i)==':' ||str.charAt(i)=='.' 
			||str.charAt(i)=='!'|| str.charAt(i)=='@')
			{
				count++;
			}
		}

		System.out.println("Number of punctuation mark is:- "+count);
	}

}

package com.method;

import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:- ");
		String str = sc.nextLine();
		
		int count = 0;
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Number of character in String :- "+count);

	}

}

package com.method;

import java.util.Scanner;

public class CountVowelAndConsonant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:- ");
		String str = sc.nextLine();
		
		int vCount = 0;
		int cCount = 0;
		
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i)=='a' ||str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				vCount++; //count the vowel
			}
			else
			{
				cCount++; //count the consonant
			}
		}
		System.out.println("Vowels are:-  "+vCount);
		System.out.println("Consonant are:- "+cCount);

	}

}

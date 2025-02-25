package com.Stings;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		String[]words = str.split(" "); //Splitting string into words
		String revstr = "";
		
		for(String w:words) 
		{
			String revword = "";
			for(int i = w.length()-1; i>=0; i--)
			{
				revword = revword+w.charAt(i);
			}
			revstr = revstr+revword+" ";
		}
		System.out.println("After reverse each word:-  "+revstr);
		
	}

}

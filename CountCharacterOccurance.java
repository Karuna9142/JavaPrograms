package com.Stings;

import java.util.Scanner;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:- ");
		String str = sc.nextLine();
		
		int totalCount = str.length();
		int totalCount_afterRemove = str.replace("a", "").length(); //total len after removing
		
		int count = totalCount-totalCount_afterRemove;
		System.out.println("Number occurance of a is:- "+count);

	}

}

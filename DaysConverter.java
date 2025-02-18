package com.assignment;

import java.util.Scanner;

public class DaysConverter {

	public static void main(String[] args) {

		//Creating scanner object for input
		Scanner sc = new Scanner(System.in);
		
		//Taking input for number of days
		System.out.println("Enter the number of days: ");
		int day = sc.nextInt();
		
		//converting into year and week
		int year = day/365;// 1 year = 365
		int weeks = ((day%365)/7);
		int days = day-((year*365) + (weeks*7));
		
		//displaying the result
		System.out.println("The number of year:- "+year);
		System.out.println("The number of weeks:- "+weeks);
		System.out.println("The number of remaining days:- "+days);

		//closing the scanner
		sc.close();

	}

}

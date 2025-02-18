package com.assignment;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Enter principle amount
		System.out.println("Enter the principle amount(F)");
		double P = sc.nextDouble();
		
		//Enter Rate of Interest
		System.out.println("Enter the Rate of Interest(R)");
		double R = sc.nextDouble();
		
		//Enter the time period
		System.out.println("Enter the time period in years(T):- ");
		double T = sc.nextDouble();
		
		//Calculating simple interest
		double SI = P*R*T/100;
		
		//Displaying the result
		System.out.println("Simple Interest is:- "+SI);

	}

}

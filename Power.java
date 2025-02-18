package com.assignment;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		//Creating scanner object for input
		Scanner sc = new Scanner(System.in);
		
		//taking input for base and exponent
		System.out.println("Enter the base:- ");
		int x = sc.nextInt();
		
		System.out.println("Enter the exponent:- ");
		int y = sc.nextInt();
		
		//calculating power using Math.pow()
		double power = Math.pow(x, y);
		
		//displaying the result
		System.out.println(x+ " raised to the power " +y+ " is :- "+power);

		//closing the scanner
		sc.close();

	}

}

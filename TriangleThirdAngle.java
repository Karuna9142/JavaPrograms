package com.assignment;

import java.util.Scanner;

public class TriangleThirdAngle {

	public static void main(String[] args) {
		
		//Creating scanner object for input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first and second angle of traingle:- ");
		double a1 = sc.nextDouble();
		double a2 = sc.nextDouble();
		
		//Calculating the third angle
		double a3 = 180-(a1+a2);
		
		//displaying the result
		System.out.println("Third angle is:- "+a3);
		//closing the scanner
		sc.close();


	}

}

package com.assignment;

import java.util.Scanner;

public class EquilateralTriangle {

	public static void main(String[] args) {
		
		//Creating scanner object for input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the side length ");
		double side = sc.nextDouble();
		
		//calculating the area 
		double area = (Math.sqrt(3)/4)*side*side;
		System.out.println("The area of equilateral triangle is:- "+area);
		
		//closing the scanner
		sc.close();


	}

}

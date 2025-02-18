package com.assignment;

import java.util.Scanner;

public class TraingleArea {

	public static void main(String[] args) {
		//Creating scanner object for input
		Scanner sc = new Scanner(System.in);
		
		//taking input for base and height
		System.out.println("Enter the base and height of triangle");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        
        //calculating the area of the triangle
        double area = (base+height)/2;
        
        //displaying the result
        System.out.println("The area of the triangle is:- "+area);
        
		//closing the scanner
		sc.close();


	}

}

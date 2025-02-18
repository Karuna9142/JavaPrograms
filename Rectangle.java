package com.assignment;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth");
		int l = sc.nextInt();
		int b = sc.nextInt();
		
		int perimeter = 2*(l+b);
		System.out.println("Perimeter of a rectangle is:- "+perimeter);

		int area = l*b;
		System.out.println("Area of rectangle is:- "+area);
	}

}

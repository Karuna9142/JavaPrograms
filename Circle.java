package com.assignment;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius");
		float rad = sc.nextFloat();
		
		System.out.println("Enter the choice 1.diameter 2.circumference 3.area");
		int choice = sc.nextInt();
		
		if(choice==1)
		{
			float diameter = 2*rad;
			System.out.println("Diameter of radius is:- "+diameter);
		}
		else if(choice==2)
		{
			double circumference = 2*3.14*rad;
			System.out.println("circumference of circle is:- "+circumference);
		}
		else if(choice==3)
		{
			double area = 3.14*rad*rad;
			System.out.println("Area of circle is:- "+area);
		}
		else
		{
			System.out.println("Invalid input");
		}
		
		
	

	}

}

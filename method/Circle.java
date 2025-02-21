package com.method;

import java.util.Scanner;

public class Circle {

	static double findDiameter(double radius)
	{
		double diameter = 2*radius;
		return diameter;
	}
	static double findCircumference(double radius)
	{
		double circumeference = 2*3.14*radius;
		return circumeference;
	}
	static double findArea(double radius)
	{
		double area = 3.14*radius*radius;
		return area;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:- ");
		double radius = sc.nextDouble();
		
		double diameter = findDiameter(radius);
		double circumference = findCircumference(radius);
		double area = findArea(radius);
		
		System.out.println("Diameter of Circle is:- "+diameter);
		System.out.println("Circumference of Circle is:- "+circumference);
		System.out.println("Area of Circle is:- "+area);

	}

}

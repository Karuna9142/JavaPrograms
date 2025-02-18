package com.assignment;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//taking input for length in cm
		System.out.println("Enter length in centimeter:- ");
		double cm = sc.nextDouble();
		
		//converting to meters and kilometers
		double meter = cm/100;
		double km = cm/100000;
		
		//Displaying the result
		System.out.println("Length in meter:- "+meter);
		System.out.println("Length in km:- " +km);

	}

}

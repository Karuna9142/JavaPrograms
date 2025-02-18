package com.assignment;

import java.util.Scanner;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
	
		//Creating scanner object for input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in fahrenheit:- ");
		double fahrenheit = sc.nextDouble();
		
		//converting to celcius
		double celcius = (fahrenheit-32)*5/9;
		
		//displaying the result
		System.out.println("Temperature in celcius:- "+celcius);
		
		//closing the scanner
		sc.close();

	}

}

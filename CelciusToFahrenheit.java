package com.assignment;

import java.util.Scanner;

public class CelciusToFahrenheit {

	public static void main(String[] args) {
		
    //Creating scanner object for input
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Temperature in Celcius:- ");
	double celcius = sc.nextDouble();
	
	//Converting to fahrenheit
	double fahrenheit = (9/5 * celcius)+32;
	
	//Displaying the result
	System.out.println("Temprature in celcius:- "+fahrenheit);
	
	//closing the Scanner
	sc.close();
	}

}

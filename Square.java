package com.assignment;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		
		//Creating scanner object for input
		Scanner sc = new Scanner(System.in);
		
		//Taking input
		System.out.println("Enter a number:- ");
		int num = sc.nextInt();
		
		//calculating the square
		int square = num*num;
		System.out.println("The square of " +num+ " is:- " +square);
		//closing the scanner
		sc.close();

	}

}

package com.method;

import java.util.Scanner;

public class EvenNumber {
	static void checkEven(int num)
	{
		if(num%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:- ");
		int num = sc.nextInt();
		
		//calling method to check the number is even or odd
		checkEven(num);

	}

}

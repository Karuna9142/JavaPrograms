package com.method;

import java.util.Scanner;

public class MaxAndMin {
	
	static void findMax(int num1, int num2)
	{
	
		if(num1>num2)
		{
			System.out.println("Maximum number is:- "+num1);
		}
		else
		{
			System.out.println("Maximum Number is:- "+num2);
		}
		
			
	}
	static void findMin(int num1, int num2)
	{
	
		if(num1<num2)
		{
			System.out.println("Minimum number is:- "+num1);
		}
		else
		{
			System.out.println("Minimum Number is:- "+num2);
		}
		
			
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number:- ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
	    findMax(num1,num2);
	    findMin(num1,num2);

		
		
		

	}

}

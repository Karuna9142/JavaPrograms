package com.method;

import java.util.Scanner;

public class Cube {

	//created method cubeNumber
	static int cubeNumber(int num)
	{
		int cube = num*num*num;
		return cube;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//input the number
		System.out.println("Enter the number:- ");
		int num = sc.nextInt();
		
		//displaying the result by calling the method
		System.out.println("Cube of " +num+ " is:- "+cubeNumber(num));

	}

}

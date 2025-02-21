package com.demo.basic;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number:- ");
		
		int a = sc.nextInt();
		int b= sc.nextInt();
		
		System.out.println("Before Swapping " );
		System.out.println("a is :- "+a+ " b is :- " +b);
		int c = a;
		a = b;
		b = c;
		
		System.out.println("After Swapping ");
		System.out.println("a is :- "+a+ " b is :- "+b);

	}

}

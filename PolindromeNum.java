package com.demo.basic;

import java.util.Scanner;

public class PolindromeNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number - ");
		int num = sc.nextInt();
		
		int temp = num;
		int rev = 0;
		while(num!=0)
		{
			rev = rev*10+num%10;
			num = num/10;
		}
		if(temp==rev)
			System.out.println(temp+ " is Polindrome");
		else
			System.out.println(temp+ " Not Polindrome");

	}

}

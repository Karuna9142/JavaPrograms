package com.demo.basic;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number- ");
		int num = sc.nextInt();
		//int rev = 0;
		
		//First way
//		while(num!=0)
//		{
//			rev = rev*10+num%10;
//			num = num/10;
//		}
		
				
		//2. Using Stringbuffer class

//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		StringBuffer rev = sb.reverse();
//		System.out.println("Reverse number is- "+rev);
		
		
		//3. Using StringBuilder
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		
		System.out.println("Reverse number is - "+rev);
		
		
		
	}

}

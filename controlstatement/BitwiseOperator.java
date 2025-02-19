package com.assignment;

public class BitwiseOperator {

	public static void main(String[] args) {
	////Bitwise operator symbols:   (  |, & , ^ )

//		Decimal 	BitValue
//		
//		0		-> 0
//		1		-> 01
//		2		-> 10
//		3		-> 11
//		4		-> 100
//		5		-> 101
//		6		-> 110
//		7		-> 111
//		8		-> 1000
//		9		-> 1001
//		10		-> 1010

		int num1 = 6;
		int num2 = 4;
		
		int num3 = num1 | num2;  // 110+100 = 100
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Num3: "+num3);

		int num4 = num1 & num2; // 110+100= 100 //110
		
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Num4: "+num4);

		int num5 = num1 ^ num2; 
		System.out.println("Bitwise XOR Operation");
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Num5: "+num5);

	}

}

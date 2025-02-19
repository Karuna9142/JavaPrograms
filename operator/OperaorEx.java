package com.operator;

import java.util.Scanner;

public class OperaorEx {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
		
		x = 10;
		System.out.println("Initial value of X: "+x);
		System.out.println("Initial value of Y: "+y);
		
		///increment operation on variables   symbol ++
		y = ++x + 2; //pre-increment
		
		System.out.println("Initial value of X:- " +x);
		System.out.println("Initial value of Y:- " +y);
		
		y = x++ + 2;  ///post-increment;   /// x= 11, y = 1
		System.out.println("Initial value of X:- " +x);
		System.out.println("Initial value of Y:- " +y);
		
	////decrement operator...    symbol --
		y = --x + 2;    ///pre-decrement;   /// x= 9, y = 11

		System.out.println("Initial value of X: "+x);
		System.out.println("Initial value of X:- " +y);

		y = x-- + 2;		///pre-decrement;   /// x= 9, y = 11
		System.out.println("Initial Value of X: " + x);
		System.out.println("Initial Value of Y: " + y);
		

	}

}

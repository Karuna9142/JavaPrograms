package com.assignment.controlstatement;

public class IfElseEx {

	public static void main(String[] args) {
		
	int x = 5, y = 7, z = 10;
	if(x>y)
	{
		System.out.println("x is greater than y");
	}
	else if (y > z)
	{
	    System.out.println("y is greater than z");
	} 
	else
	{
	    System.out.println("z is the largest number");
	}
	System.out.println((y > x));


	}

}

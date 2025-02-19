package com.assignment.controlstatement;

public class IterativeStatementEx {

	public static void main(String[] args) {


		//for loop
		for(int i = 0; i<10; i++)
		{
			System.out.println("Hello Everyone");
		}
		int n = 10;
		while(n<20)
		{
			System.out.println("Good Morning!");
			n++;
		}
		
		do
		{
			System.out.println("What's going on");
			n++;
		}
		while(n<15);
		
		int[] arr = new int[4];
		for(Integer num:arr) {
			System.out.println("array Element: "+num);
		}

	}

}

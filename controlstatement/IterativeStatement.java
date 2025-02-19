package com.assignment.controlstatement;

public class IterativeStatement {

	public static void main(String[] args) {
		
		for(int i = 1; i<100; i++)
		{
			System.out.println("Welcome karuna! you are a good java developer");
		}
		int num = 5;
		while(num<10) {
			System.out.println("have a nice day to you");
			num++;
			break;
		}

		do
		{
			System.out.println("Bye");
			num++;
		}
		while(num<6);
	}

}

package com.assignment.controlstatement;

public class Break2 {

	public static void main(String[] args) {
		
		l1:
			System.out.println("Hi!, Karuna");
		    System.out.println("Welcome");
		
		l2:
			for(int i = 0; i<4; i++) {
				System.out.println("Hello");
		        break l2;
			}
		for(int i = 2; i<6; i++)
		{
			System.out.println("Hii");
		}

	}

}

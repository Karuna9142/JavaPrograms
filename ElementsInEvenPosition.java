package com.array.assignment;

import java.util.Scanner;

public class ElementsInEvenPosition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array:- ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the element of an array:- ");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		//displaying the result
		for(int i = 0; i<arr.length; i++)
		{
			if(i%2==0)
			{
				System.out.println("elements of an array at " +i+ " position is:- "+arr[i]);
			}
		}


	}

}

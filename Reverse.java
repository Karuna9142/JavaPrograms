package com.array.assignment;

import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:- ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		int n = arr.length;
		System.out.println("Enter the element of an array:- ");
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements in reverse order:- ");
		for(int i = n-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}

}

}

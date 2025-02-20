package com.array.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {

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
		//assume the first element is the largest
		int max = arr[0];
		//Traverse the array to find the largest element
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		//print the largest element
		System.err.println("Largest element of an array is:- "+max);


	}

}

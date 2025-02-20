package com.array;

import java.util.Scanner;

public class MultiDimeArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][]m = new int[2][3];
		
		System.out.println("Enter Matrix Element:- ");
		for(int i = 0; i<2; i++)
		{
			for(int j = 0; j<3; j++)
			{
				m[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrix Element:- ");
		for(int i = 0; i<2; i++)
		{
			for(int j = 0; j<3; j++)
			{
				System.out.print(m[i][j]+ " ");
			}
			System.out.println();
		}
	}

}

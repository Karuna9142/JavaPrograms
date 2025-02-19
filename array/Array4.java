package com.array;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<arr.length; i++){
            System.out.println("Enter Array Data: ");
            arr[i] = s.nextInt();
        }

        System.out.println("Displaying arrays elements: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}

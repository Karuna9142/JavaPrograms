package com.array;

import java.util.Scanner;

public class ArrayMul {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        int[][] m1 = new int [2][3];

        for(int i=0; i<2; i++){

            for(int j=0; j<3; j++){
                System.out.println("Enter data: ");
                m1[i][j] = s.nextInt();
            }
        }

        System.out.println("Displaying Multidimension array data: ");
        for(int i=0; i<2; i++){

            for(int j=0; j<3; j++){
                System.out.println(m1[i][j]+" ");

            }
        }

	}

}

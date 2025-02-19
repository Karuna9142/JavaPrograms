package com.assignment.controlstatement;

public class ReturnStatement {

	public static void main(String[] args) {
	
		 int num = 10;

	        for (int i = 1; i <= num; i++) {

	            System.out.println("PCS GLOBAL NEW OPENED BRANCH IS AT NOIDA SECTOR-63");

	            if (i % 2 == 0) {
	                int resultSum = sum(i,4);    ///caller
	                System.out.println("Sum of "+i+", 4 = "+resultSum);
	            }
	            System.out.println("Main Branch is at Kolkata");
	        }
	}
	public static int sum(int x, int y){    /// /called

        return x+y;   ///return to caller method with value...
    }



}

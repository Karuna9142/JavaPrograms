package com.assignment.controlstatement;

public class ContinueTransferStatement {

	public static void main(String[] args) {
	
		int num = 10;

        for(int i=1; i<=num; i++){

            System.out.println("PCS GLOBAL NEW OPENED BRANCH IS AT NOIDA SECTOR-63");

            if( i%2 == 0){
                continue;
            }
            System.out.println("Main Branch is at Kolkata");
        }

	}

}

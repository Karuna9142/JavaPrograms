package com.array;

public class Array1 {

	public static void main(String[] args) {
	
		int[] arrayName;       ///array declaration

        arrayName = new int[6];    ///memory allocation

        arrayName[0] = 10;      ///Array initialization
        arrayName[1] = 20;
        arrayName[2] = 30;
        arrayName[3] = 40;
        arrayName[4] = 50;
        arrayName[5] = 60;

        System.out.println("Arrays elelemts: ");    ///accessing array elements.
        for (int x: arrayName){
            System.out.print(x+" ");
        }

//        for(int i=0; i<arrayName.length; i++){
//            System.out.print(arrayName[i]+" ");
//        }

    }

}

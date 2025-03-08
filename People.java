package com.oops;

public class People {
	
	static void dis() {
		System.out.println("Hello Karuna, How are you doing");
	}
	static int var1 = 20;

	public static void main(String[] args) {
		System.out.println(var1);
		People.dis(); //static call using class name
		dis(); //static call directly
		
		People obj = new People();
		obj.dis();//static method call using class object.

	}

}

package com.oops.constructor;

public class Person extends Object {
	int personId;
    String personName;
    int personAge;
    String personCity;
    String personColor;

    public Person(){

    }
	public Person(int personId, String personName, int personAge, String personCity, String personColor) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
		this.personCity = personCity;
		this.personColor = personColor;
	}
	 void printInfo()
	 {
	        System.out.println("Id: "+personId);
	        System.out.println("Name: "+personName);
	        System.out.println("Age: "+personAge);
	        System.out.println("City: "+personCity);
	        System.out.println("Color: "+personColor);
	 }
	    

	public static void main(String[] args) {
	
		  Person p1 = new Person(101, "Karuna", 26, "Noida", "NA");

	        p1.printInfo();
	        p1.toString();

	}

}

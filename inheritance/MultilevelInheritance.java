package com.oops.inheritance;


class Vehicle1 {
	private String vehicleModelNo;
	
	//creating constructor
	Vehicle1(String vehicleModelNo){
		this.vehicleModelNo = vehicleModelNo;
	}
	void displayModelNumber() {
		System.out.println("Car model Number:- "+vehicleModelNo);
	}
}
class Car1 extends Vehicle1{
	
	String color;
	
	Car1(String color, String vehicleModelNo) {
		super(vehicleModelNo);
		this.color = color;
	}
	
	void displayColor()
	{
		System.out.println("Color of car is:- "+color);
	}
}
class Audi extends Car1 {
	String name;
	
	Audi(String name, String color, String vehicleModelNo) {
		super(color,vehicleModelNo);
		this.name = name;
	}
	
	void displayName()
	{
		System.out.println("Name of Audi is:- "+name);
	}
	void startEngine() {
		System.out.println("Car engine is starting");
	}
	void stopEngine() {
		System.out.println("Car engine is stopping");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
	
		Audi a1 = new Audi("Audi Gold", "Blue","8569");
		a1.displayName();
		a1.startEngine();
		a1.stopEngine();
		a1.displayColor();
		a1.displayModelNumber();
	}

}

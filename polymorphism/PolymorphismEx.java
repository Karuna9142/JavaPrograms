package com.oops.polymorphism;

class Bus{
	private String busModelNo;
	private String busName;
	private String busColor;
	private String busSpeed;
	
	public Bus(String busModelNo) {
		this.busModelNo = busModelNo;
		System.out.println("Only one parameter constructor is called");
	}
	public Bus(String busModelNo, String busName) {
		this(busModelNo); //one argument constructor called
		this.busName = busName;
		System.out.println("Two parameter constructor called");
	}
	public Bus(String busModelNo, String busName, String busColor, String busSpeed) {
		this(busModelNo, busName); //one argument constructor called
		this.busColor = busColor;
		this.busSpeed = busSpeed;
		System.out.println("Four parameter constructor called");
	}
	
	void displayBusInfo()
	{
		System.out.println("Bus Model No. "+busModelNo);
		System.out.println("Bus Name:- "+busName);
		System.out.println("Bus Color:- "+busColor);
		System.out.println("Bus speed:- "+busSpeed);
	}
	
}
public class PolymorphismEx {

	public static void main(String[] args) {
		Bus b1 = new Bus("3456", "Mona","brown","70");
		b1.displayBusInfo();

	}

}

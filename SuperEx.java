package com.oops;

import java.util.Scanner;

class Shape {
	String shapeName;

	public Shape(String shapeName) {
		this.shapeName = shapeName;
	}
	void display() {
		System.out.println("Shape Name:- "+shapeName);
	}
}
class Rectangle extends Shape{

	private float len;
	private float width;
	
	Rectangle(float len, float width, String name) {
		super(name); //parent class constructor called
		this.len = len;
		this.width = width;
	}
	void displayShape() {
		super.display();
	}
	void displayArea() {
		System.out.println(shapeName+" Area:- "+(len*width));
	}
	void displayPerimeter() {
		System.out.println(shapeName+ " Perimeter:- "+2*(len*width));
	}
	
}
public class SuperEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rectangle Shape Name:- ");
		String name = sc.nextLine();
		
		System.out.println("Enter Rectangle length:- ");
		float len = sc.nextFloat();
		
		System.out.println("Enter Rectangle width:- ");
		float width = sc.nextFloat();
		
		Rectangle r1 = new Rectangle(len, width, name);
		r1.displayArea();
		r1.displayPerimeter();
		r1.displayShape();
		

	}

}

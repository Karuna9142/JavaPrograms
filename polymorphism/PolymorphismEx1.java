package com.oops.polymorphism;

class Rectangle {
	double area;

	void calculateArea() {
		area = 20 * 10;

	}

	void calculateArea(int l, int b) {
		area = l * b;
	}

	void calculateArea(double l, int b) {
		area = l * b;
	}

	void calculateArea(double l, double b) {
		area = l * b;
	}

	void displayArea() {
		System.out.println("Area of Rectangle: " + area);
	}

}
public class PolymorphismEx1 {

	public static void main(String[] args) {
		
		Rectangle rec1 = new Rectangle();
		rec1.calculateArea();
		rec1.displayArea();
		
		rec1.calculateArea(5, 6);
		rec1.displayArea();
		
		rec1.calculateArea(2.5, 6);
		rec1.displayArea();
		
		rec1.calculateArea(2.5, 2.5);
		rec1.displayArea();


	}

}

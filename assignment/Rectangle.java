package com.oops.assignment;

public class Rectangle {
	
	 private double width;
	 private double height;
	 
	 public Rectangle(double width, double height) {
	 this.width = width;
	 this.height = height;
	 }
	 public double calculateArea() {
		 return width * height;
		 }
		 public double calculatePerimeter() {
		 return 2 * (width + height);
		 }
		 
		 public void display() {
		 System.out.println("Width: " + width + ", Height: " + height);
		 System.out.println("Area: " + calculateArea());
		 System.out.println("Perimeter: " + calculatePerimeter());
		 }
		 

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5.0, 10.0);
		 rect.display();s
		

	}

}

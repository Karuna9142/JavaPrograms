package com.oops;

class Animals{
	public static String animalName;
	
	Animals(String name) {
		this.animalName = animalName;
	}
	public static void run()
	{
		System.out.println(animalName+ " is Running");
	}
	public static void makeSound() {
		System.out.println("Animal sound method is running");
	}
}
public class StaticMethodEx {

	public static void main(String[] args) {
		Animals.animalName = "Lion";
		Animals.run();
		Animals.makeSound();

	}

}

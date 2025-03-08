package com.oops;

class Animal{
	public static String animalName;
	private static int animalCount = 0;
	
	Animal(String name) {
		this.animalName = name;
		animalCount++;
	}
	public static void displayAnimalCount() {
		System.out.println("Total Available animal:- "+animalCount);
	}
}
public class StaticEx {

	public static void main(String[] args) {
		
		Animal tiger = new Animal("Tiger");
		Animal cat = new Animal("Cat");
		Animal dog = new Animal("Dog");
		Animal horse = new Animal("Horse");
		Animal cow = new Animal("Cow");

		Animal.displayAnimalCount();
		

	}

}

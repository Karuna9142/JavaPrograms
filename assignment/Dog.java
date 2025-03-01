package com.oops.assignment;

public class Dog {
	
	private String name;
	private String breed;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	public void display()
	{
		System.out.println("Dog name - "+name+ ", Breed - "+breed);
	}
	public static void main(String[] args) {
		Dog d1 = new Dog("Moti", "Labrador");
		Dog d2 = new Dog("Rocky", "German");
		
		System.out.println("Before modification - ");
		d1.display();
		d2.display();
		
		d1.setName("Buddy");
		d1.setBreed("German");
		
		d2.setName("Golu");
		d2.setBreed("Bulldog");
		
		System.out.println("After Modification");
		d1.display();
		d2.display();

	}

}

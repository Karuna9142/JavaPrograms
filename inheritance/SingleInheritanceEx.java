package com.oops.inheritance;

class Human{
	protected void makeSound() {
		System.out.println("Human is Speaking");
	}
}
class Person extends Human{
	void personsleep() {
		System.out.println("Person is doing job");
	}
}
public class SingleInheritanceEx {

	public static void main(String[] args) {
		
		//creating instance of parent class
		Person p1 = new Person();
		p1.makeSound();
		p1.personsleep();
		

	}

}

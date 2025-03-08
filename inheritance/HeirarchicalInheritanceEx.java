package com.oops.inheritance;

class Dog
{
	
	void bark()
	{
		System.out.println("Dog is barking");
	}
}
class Cat extends Dog
{
	void meows()
	{
		System.out.println("Cats area making sound");
	}
}
class Horse extends Dog
{
	void run()
	{
		System.out.println("Horses are running");
	}
}
public class HeirarchicalInheritanceEx {

	public static void main(String[] args) {
		Horse h1 = new Horse();
		h1.run();
		h1.bark();
		
		Cat c1 = new Cat();
		c1.meows();
		c1.bark();
		

	}

}

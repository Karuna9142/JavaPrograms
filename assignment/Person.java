package com.oops.assignment;

public class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println("Name - "+name+ ", Age -"+age);
	}
	public static void main(String[] args) {
		Person p1 = new Person("kkm", 25);
		Person p2 = new Person("skm", 30);
		
		p1.display();
		p2.display();
	}

}

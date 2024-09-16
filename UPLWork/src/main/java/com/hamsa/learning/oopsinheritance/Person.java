package com.hamsa.learning.oopsinheritance;

public abstract class Person {
	String firstName;
	String lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public abstract void display();

	public void compute() {
//definition
	}
}

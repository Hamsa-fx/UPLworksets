package com.hamsa.assignment6;

public class Person {
	protected String name;
	protected int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.print("\n Name = " + name + "\n Age = " + age + "\n");
	}
}

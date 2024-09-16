package com.hamsa.assignment6;

public class Student extends Person {
	int studentID;

	Student() {
		super("Lakshmi", 23);
		System.out.println(" First Student ");
		super.display();
	}

	Student(String name) {
		super(name, 23);
		System.out.println(" Second Student ");
		super.display();
	}

	Student(String name, int studentID) {
		super(name, 23);
		this.studentID = studentID;
		System.out.println(" Third Student ");
		super.display();
		System.out.println("Student ID = " + studentID);
	}

}

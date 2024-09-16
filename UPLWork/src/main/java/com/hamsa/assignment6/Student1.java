package com.hamsa.assignment6;

public class Student1 extends Person {
	int studentID;

	public Student1(String name, int age, String collegeName, int studentID, String address) {
		super(name, age);
		this.studentID = studentID;
		System.out.println("********* Student's Details ******************");
		super.display();
		System.out.println("College Name = " + collegeName);
		System.out.println("Student ID = " + studentID);
		System.out.println("Address = " + address);
	}

	
}
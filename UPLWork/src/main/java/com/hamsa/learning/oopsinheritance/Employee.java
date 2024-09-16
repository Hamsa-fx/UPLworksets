package com.hamsa.learning.oopsinheritance;

public class Employee extends Person {
	String empId;
	String desig;
	Double salary;

	public Employee(String firstName, String lastName, String empId, String desig, Double salary) {

		super(firstName, lastName);// subclass constructor
		this.empId = empId;
		this.desig = desig;
		this.salary = salary;
	}

	public void display() {
// super.display();
		System.out.println(this.firstName +  "::" + this.lastName + "::"

				+ this.empId + "::" + this.desig + "::" + this.salary);
	}
}

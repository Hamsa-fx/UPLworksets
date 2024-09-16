package com.hamsa.learning.oops;

import java.util.Scanner;

  class Employee {
	String firstName;
	String lastName;
	String empId;
	double salary;
	String desig;

	public Employee() { // default constructor
	}

	// method or behavior
	public void read() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the first name");
		this.firstName = scanner.next();
		System.out.println("please enter the last name");
		this.lastName = scanner.next();
		System.out.println("please enter the empId");
		this.empId = scanner.next();
		System.out.println("please enter the Salary");
		this.salary = scanner.nextDouble();
		System.out.println("please enter the designation");
		this.desig = scanner.next();
		scanner.close();
	}

	// display
	public void display() {
		System.out.println(this.firstName + ":: " + this.lastName + " :: " + this.empId + " :: " + this.salary + " :: "
				+ this.desig);
	}

}

public class TestOOPS {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.read();
		employee.display();
	}
}

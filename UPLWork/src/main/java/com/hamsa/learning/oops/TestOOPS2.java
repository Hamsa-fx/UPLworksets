package com.hamsa.learning.oops;

import java.util.Scanner;

//pojo objects -- class encapsulate class
class Employee2 {
//attribute or data members
//instance variables
	private String firstName;
	private String lastName;
	private String empId;
	private double salary;
	private String desig;

	public Employee2() { // default constructor
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	/**
	 * this method used to display the employee information
	 */
// display
	public void display() {
		System.out.println(this.getFirstName() + ":: " + this.getLastName() + " :: " + this.getEmpId() + " :: "
				+ this.getSalary() + " :: " + this.getDesig());
	}
}

public class TestOOPS2 {
	public static void main(String argsp[]) {
		Employee2 employee = new Employee2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the first name");
		employee.setFirstName(scanner.next());
		System.out.println("please enter the last name");
		employee.setLastName(scanner.next());
		System.out.println("please enter the empId");
		employee.setEmpId(scanner.next());
		System.out.println("please enter the Salary");
		double salary = scanner.nextDouble();
		employee.setSalary(salary);
		System.out.println("please enter the designation");
		employee.setDesig(scanner.next());

		scanner.close();
		employee.display();
	}
}

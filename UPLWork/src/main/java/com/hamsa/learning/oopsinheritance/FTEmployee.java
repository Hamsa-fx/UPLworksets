package com.hamsa.learning.oopsinheritance;

public class FTEmployee extends Employee {
	int hrs;

	public FTEmployee(String firstName, String lastName, String empId, String desig, Double salary) {

		super(firstName, lastName, empId, desig, salary);
		this.hrs = 40;
	}

public void display() {
// super.display();
System.out.println(this.firstName + " ::"+"::"+this.lastName+" ::"

+this.empId + ":; "+ this.desig + " :: "+this.salary+" ::"+this.hrs);
                 }
}

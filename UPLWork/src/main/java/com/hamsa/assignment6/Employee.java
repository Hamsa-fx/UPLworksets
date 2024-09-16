package com.hamsa.assignment6;

public class Employee extends Person {
	Employee (String name, int age, String companyName, int employeeID,String address) {
		super (name, age);
		System.out.println ("********** Employee Details ***********");
		super.display ();
		System.out.println ("Company Name = " + companyName);
		System.out.println ("Employee ID = " + employeeID);
		System.out.println ("Address = " + address);
		}

}

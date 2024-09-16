package com.hamsa.assignment9;

public class Employee {
	String firstName;
	String empId;
//	String desig;
	Double salary;

	public Employee(String firstName,String empId, Double salary) {

		this.firstName = firstName;
		this.empId = empId;
	//	this.desig = desig;
		this.salary = salary;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.firstName +  "::" 
				+ this.empId + "::" +  this.salary;
	}
}

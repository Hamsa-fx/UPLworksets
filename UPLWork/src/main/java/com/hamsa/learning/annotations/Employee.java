package com.hamsa.learning.annotations;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	@SuppressWarnings("unchecked")
	public List getEmployee() {
		List emps = new ArrayList();
		emps.add("Mallikarjuna");
		emps.add("swamy");
		emps.add("Raghavendra");
		emps.add("parashurama");
		return emps;
	}

	public static void main(String args[]) {
		Employee emp = new Employee();
		System.out.println(emp.getEmployee());
	}

}

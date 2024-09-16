package com.hamsa.learning.streamsapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class FilterList {
	public FilterList() {
	}

	public List<String> filter(List<String> arr) {
		List<String> filterArr = new ArrayList<String>();
		for (String ar : arr) {
			if (ar.length() > 5)
				filterArr.add(ar);

		}
		return filterArr;
	}
}

class Employee {
	String name;
	double salary;

	public Employee() {
	}

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public List<Employee> readEmployee() {
		List<Employee> empArr = new ArrayList<Employee>();
		for (int i = 0; i < 5; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the employee(name, salary) ");
			String name = scan.next();
			Double salary = scan.nextDouble();
			Employee employee = new Employee(name, salary);
			empArr.add(employee);
		}
		return empArr;
	}

	public List<Employee> incrementSalary(List<Employee> employees) {
		Scanner scan = new Scanner(System.in);
		for (Employee emp : employees) {
			emp.salary = emp.salary + (emp.salary * 0.1);
		}
		return employees;
	}

	public void display(List<Employee> emps) {
		for (Employee emp : emps) {
			System.out.println(emp.name + "::" + emp.salary);
		}
	}
}

public class TestStreamEx2 {
	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();
		arr.add("apple");
		arr.add("banana");
		arr.add("orange");
		// without stream
		System.out.println(new FilterList().filter(arr));
		// with stream
		Stream<String> arrStream = arr.stream();
		List<String> arr2 = arrStream.filter(str -> str.length() > 5).collect(Collectors.toList());
		System.out.println(arr2);
		List<Employee> employees = new ArrayList<Employee>();
		List<Employee> employees1 = new ArrayList<Employee>();
		// without streams
		Employee emp = new Employee();

		employees = emp.readEmployee();
		employees1.addAll(employees);
		System.out.println("Before increment::");
		emp.display(employees);

		System.out.println("After increment::");
		employees = emp.incrementSalary(employees);
		emp.display(employees);

		// with stream(map)
		List<Double> empStream = employees1.stream().map(e -> e.salary + e.salary * 0.01f).collect(Collectors.toList());
		System.out.println(empStream);
		emp.display(employees);

		List<Employee> employeesList = Arrays.asList(new Employee("Raghu",100), new Employee("Brian", 100),
				                                     new Employee("Ahamed", 200),new Employee("Swamy",200),
				                                     new Employee("Smith", 300),new Employee("Hanan", 300));

		List<Double> distinctSalaries = employeesList.stream().map(e -> e.salary).distinct().collect(Collectors.toList());
		System.out.println(distinctSalaries);
	}

}

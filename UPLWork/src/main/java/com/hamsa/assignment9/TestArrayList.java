package com.hamsa.assignment9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// cocept increasing grow()
		int oldCapacity = 10;
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		System.out.println(newCapacity);
		System.out.println("Demonstration of Integer values");
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		System.out.println(arr);
		System.out.println("array list size " + arr.size());
		System.out.println("is empty " + arr.isEmpty());
		System.out.println("Iterate the array ");
		Iterator<Integer> iter = arr.iterator();
		while (iter.hasNext()) {

			Integer val = iter.next();
			System.out.println(val);
		}
		// using for each loop
		System.out.println("using for each loop");
		for (int item : arr) {
			System.out.println(item);
		}
		System.out.println("Demonstration of String values");
		List<String> arrStr = new ArrayList<String>();
		arrStr.add("Mallik");
		arrStr.add("Ramesh");
		arrStr.add("Ahamed");
		arrStr.add("Somashaekar");

		System.out.println(arrStr);
		System.out.println("array list size " + arrStr.size());
		System.out.println("is empty " + arrStr.isEmpty());

		System.out.println("Iterate the array ");
		Iterator<String> iterStr = arrStr.iterator();
		while (iterStr.hasNext()) {

			String val = iterStr.next();
			System.out.println(val);
		}
		// using for each loop
		System.out.println("using for each loop");
		for (String item : arrStr) {
			System.out.println(item);
		}
		System.out.println("Demonstration of Object values");
		List<Employee> empArr = new ArrayList<Employee>();
		empArr.add(new Employee("Mallik", "A001", 10000.0));
		empArr.add(new Employee("Ramesh", "A002", 20000.0));
		empArr.add(new Employee("Ahamed", "A003", 30000.0));
		empArr.add(new Employee("Soumya", "A002", 40000.0));

		System.out.println(empArr);
		System.out.println("array list size " + empArr.size());
		System.out.println("is empty " + empArr.isEmpty());

		System.out.println("Iterate the array ");
		Iterator<Employee> empArrIter = empArr.iterator();
		while (empArrIter.hasNext()) {

			Employee emp = empArrIter.next();
			System.out.println(emp.getEmpId() + "::" + emp.getFirstName() + " ::" + emp.getSalary());
		}
		// using for each loop
		System.out.println("using for each loop");
		for (Employee emp : empArr) {
			System.out.println(emp.getEmpId() + " :: " + emp.getFirstName() + " :: " + emp.getSalary());
		}
		System.out.println("Demonstration of Object values");
		List<Employee> empArr1 = new ArrayList<Employee>();
		empArr1.add(new Employee("Mallik", "A001", 10000.0));
		empArr1.add(new Employee("Ramesh", "A002", 20000.0));
		empArr1.add(new Employee("Ahamed", "A003", 30000.0));
		empArr1.add(new Employee("Soumya", "A002", 40000.0));

		List<Employee> empArr2 = new ArrayList<Employee>();
		empArr2.add(new Employee("Mohammed", "B001", 10000.0));
		empArr2.add(new Employee("Anju", "B002", 20000.0));
		empArr2.add(new Employee("Raghu", "B003", 30000.0));
		empArr2.add(new Employee("Venki", "B002", 40000.0));
		System.out.println("Before add all(union) ");
		System.out.println(empArr1);
		System.out.println(empArr2);
		empArr1.addAll(empArr2);
		System.out.println(empArr1);
		Employee emp1 = new Employee("Mohammed", "B001", 10000.0);

		if (empArr1.contains(emp1)) {
			System.out.println("exists");
		} else {
			System.out.println("not exists");
		}

		List<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);
		arr1.add(40);

		List<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(20);
		arr2.add(50);
		arr2.add(10);
		arr2.add(30);
		// arr1.addAll(arr2); // union
		// System.out.println(arr1);
		arr1.retainAll(arr2); // intersection
		System.out.println(arr1);

		// get items

		System.out.println(arr1.get(2));
	}

}

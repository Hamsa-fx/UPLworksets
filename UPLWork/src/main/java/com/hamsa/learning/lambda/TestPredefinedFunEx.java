package com.hamsa.learning.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class User {
	String userName;
	String password;

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
}

class Employee {
	String name;
	float salary;

	public Employee(String name, float salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
}

class Student {
	String collegeName;

	public Student() {
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
}

public class TestPredefinedFunEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		Predicate<String> isLength = (str)-> str.length()>5;
		System.out.println(isLength.test("Mallikarjuna"));
		System.out.println(isLength.test("Arun"));

		List<String> arrObj1 = new ArrayList<String>();
		arrObj1.add("Mallikarjuna");
		arrObj1.add("Ahamed");
		Predicate<List<String>> arrObj = arr1->arr1.isEmpty();
		System.out.println("the arrObj"+arrObj.test(arrObj1));

		Predicate<User> userObj = user->user.userName.equals("Mallik")&&user.password.equals("Mallik");
		if(userObj.test(new User("Mallik","Mallik"))){
		System.out.println("Valid User");
		}else {
			System.out.println("Invalid user");
		}
		Function<Integer,Integer> square = a->a*a;
		System.out.println(square.apply(10));

		Function<String,Integer> len = str->str.length();
		System.out.println(len.apply("Mallikarjuna"));

		List<Employee> arrObj2 = new ArrayList<Employee>();
		arrObj2.add(new Employee("Mallikarjuna",1000f));
		arrObj2.add(new Employee("Swamy",2000f));

		Function<List<Employee>,Float> emp = (l)-> {
		float totalSal=0.0f;
		for(Employee e: l) {
		totalSal = totalSal+e.salary;
		}
		return totalSal;
		};
		System.out.println(emp.apply(arrObj2));
		Student std=new Student();
		Consumer<Student> con = a->a.setCollegeName("JNNCE");
		con.accept(std);
		System.out.println(std.getCollegeName());

		Supplier<Double> sup = ()->Math.random();
		System.out.println(sup.get());
	}
}



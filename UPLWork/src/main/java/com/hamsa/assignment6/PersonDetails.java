package com.hamsa.assignment6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PersonDetails {
	public static void main(String[] args) {
		String name;
		int age = 0;
		int studentID;
		int employeeID;
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(" Enter the name of student ");
			name = buffer.readLine();
			System.out.println(" Enter the age of student ");
			age = Integer.parseInt(buffer.readLine());
			System.out.println("Enter the student ID ");
			studentID = Integer.parseInt(buffer.readLine());
			Student firstStudent = new Student();
			Student secondStudent = new Student(name);
			Student thirdStudent = new Student(name, studentID);
//			System.out.println(" Enter the name of employee ");
//			name = buffer.readLine();
//			System.out.println(" Enter the age of employee ");
//			age = Integer.parseInt(buffer.readLine());
//			System.out.println(" Enter the employee ID ");
//			employeeID = Integer.parseInt(buffer.readLine());
//			//Employee employee = new Employee(name, age, employeeID);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

}

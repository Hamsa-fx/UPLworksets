package com.hamsa.assignment6;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PersonDetails1 {
	public static void main(String[] args) {
		String name, collegeName, companyName, address;
		int age, studentID, employeeID;
		try {
			// Enter the details of students
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the name of the student ");
			name = buffer.readLine();
			System.out.print("Enter the age of the student ");
			age = Integer.parseInt(buffer.readLine());
			System.out.print("Enter the name of the student's college ");
			collegeName = buffer.readLine();
			System.out.print("Enter the student ID of student ");
			studentID = Integer.parseInt(buffer.readLine());
			System.out.println("Enter the address of the student ");
			address = buffer.readLine();
			Student1 student = new Student1(name, age,collegeName,studentID,address);
			// Enter the details of employee
			System.out.print("\n\n Enter the name of the employee ");
			name = buffer.readLine();
			System.out.print("Enter the age of the employee ");
			age = Integer.parseInt(buffer.readLine());
			System.out.print("Enter the name of the employee's company ");
			companyName = buffer.readLine();
			System.out.print("Enter the employee ID of the employee ");
			employeeID = Integer.parseInt(buffer.readLine());
			System.out.print("Enter the address of the employee ");
			address = buffer.readLine();
			Employee employee = new Employee(name, age, companyName,employeeID, address);

		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

}

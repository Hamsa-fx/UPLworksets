package com.hamsa.assignment6;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentServiceImpl implements StudentService {
	StudentDetails student = new StudentDetails();
	String name, address;
	int age, numberOfSubjects;
	String subjects[] = new String[10];
	int marks[] = new int[10];

	public void studentsDetails() throws Exception {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name of the student");
		name = buffer.readLine();
		student.setName(name);
		System.out.println("Enter age of the student");
		age = Integer.parseInt(buffer.readLine());
		student.setAge(age);
		System.out.println("Enter address of the student");
		address = buffer.readLine();
		student.setAddress(address);
	}

	public void inputMarks () throws Exception {
	String input;

	BufferedReader buffer = new BufferedReader (new InputStreamReader (System.in));
	System.out.println ("Enter the number of subjects");
	numberOfSubjects = Integer.parseInt (buffer.readLine ());
	student.setNumberOfSubjects (numberOfSubjects);
	System.out.println ("Enter marks of the student in each subjects");
	for (int count = 0; count < student.getNumberOfSubjects(); count++) {
	System.out.println ("Enter the name of subject");
	input = buffer.readLine ();
	subjects [count] = input;
	System.out.println ("Enter the marks in" + input);
	marks [count] = Integer.parseInt (buffer.readLine ());
	}
	student.setSubjects (subjects);
	//student.getMarks (marks);
	student.setMarks (marks);
	}

	public void studentsResult() {
		int sum = 0;
		System.out.println("Name = " + student.getName());
		System.out.println("Age = " + student.getAge());
		System.out.println("Address = " + student.getAddress());
		marks = student.getMarks();
		for (int count = 0; count < student.getNumberOfSubjects(); count++) {
			sum = sum + marks[count];
		}
		System.out.println("Total = " + sum);
		System.out.println("Percentage =" + (sum / student.getNumberOfSubjects()) + " %");
	}

}

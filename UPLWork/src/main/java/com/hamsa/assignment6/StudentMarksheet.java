package com.hamsa.assignment6;

public class StudentMarksheet {
	public static void main(String[] args) {
		try {
			StudentService student = new StudentServiceImpl();
			student.studentsDetails();
			student.inputMarks();
			student.studentsResult();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

}

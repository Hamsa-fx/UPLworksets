package com.hamsa.assignment6;

public class StudentDetails {
	private String name, address;
	private int age, numberOfSubjects;
	private String subjects[] = new String[10];
	private int marks[] = new int[10];

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the numberOfSubjects
	 */
	public int getNumberOfSubjects() {
		return numberOfSubjects;
	}

	/**
	 * @param numberOfSubjects the numberOfSubjects to set
	 */
	public void setNumberOfSubjects(int numberOfSubjects) {
		this.numberOfSubjects = numberOfSubjects;
	}

	/**
	 * @return the subjects
	 */
	public String[] getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects the subjects to set
	 */
	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	/**
	 * @return the marks
	 */
	public int[] getMarks() {
		return marks;
	}

	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int[] marks) {
		this.marks = marks;
	}

}

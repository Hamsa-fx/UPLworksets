package com.hamsa.learning.annotations;

public class Student {
	@Deprecated
	public void getStiphend() {
		System.out.println("current stiphend computation");
	}

	public void getLatestStiphend() {
		System.out.println("latest stiphend computations");
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.getStiphend();
		student.getLatestStiphend();
	}

}

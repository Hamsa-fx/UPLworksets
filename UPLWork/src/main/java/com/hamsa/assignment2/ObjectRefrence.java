package com.hamsa.assignment2;

public class ObjectRefrence {
	public static void main(String args[]) {
		String firstString = "lakshmi";
		String secondString = "lakshmi";
		if (firstString == secondString) {
			System.out.println("first time");
		}
		String thirdString = new String("lakshmi");
		String fourthString = new String("lakshmi");
		if (thirdString == fourthString) {
			System.out.println("Second");
		}
		if (thirdString.equals(fourthString)) {
			System.out.println("Third Time");
		}
	}

}

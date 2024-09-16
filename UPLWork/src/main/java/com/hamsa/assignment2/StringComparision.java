package com.hamsa.assignment2;

public class StringComparision {
	public static void main(String[] args) {
		String firstString = "lakshmi";
		String secondString = new String("lakshmi");
		String thirdString = "lakshmi";
		if (firstString == secondString) {
			System.out.println("The strings are equal.");
		} else {
			System.out.println("The strings are unequal.");
		}
		if (firstString == thirdString) {
			System.out.println("The strings are equal.");
		} else {
			System.out.println("The strings are unequal.");
		}
	}
}

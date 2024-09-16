package com.hamsa.learning.lambda;

@FunctionalInterface
interface Compute {
	int addition(int a, int b);

	default int subtraction(int a, int b) {
		return a - b;
	}

	static int multiplication(int a, int b) {
		return a * b;
	}
}

public class TestFunIDefaultandStatic {
	public static void main(String[] args) {
		Compute comp = (a, b) -> a + b;
		System.out.println("ADDITION IS::" + comp.addition(10, 10));
		System.out.println("SUBTRACTION IS: " + comp.subtraction(20, 10));
		System.out.println("MULTIPLICATION IS:" + Compute.multiplication(30, 40));
	}

}

package com.hamsa.learning.oops;

public class TestCalculator {
	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		calculator.setFirstNumber(20);
		calculator.setSecondNumber(10);
		System.out.println("Addition:: " + calculator.add());
		System.out.println("Multiplication:: " + calculator.mul());
		System.out.println("Subtraction:: " + calculator.sub());
		System.out.println("Division:: " + calculator.div());

	}

}

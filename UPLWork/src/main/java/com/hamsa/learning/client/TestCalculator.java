package com.hamsa.learning.client;
import com.hamsa.learning.oopsinterface.Calculator;
import com.hamsa.learning.oopsinterface.CalculatorImpl;

public class TestCalculator {
	public static void main(String args[]) {
		Calculator calculator = new CalculatorImpl(20,10);
		System.out.println("Addition ::"+calculator.add());
		System.out.println("Subtraction ::"+calculator.sub());
		System.out.println("Multiplication ::"+calculator.mul());
		System.out.println("Division ::"+calculator.div());
		}
}

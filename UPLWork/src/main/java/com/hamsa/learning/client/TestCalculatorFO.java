package com.hamsa.learning.client;
import com.hamsa.learning.oopsinterface.Calculator1;

public class TestCalculatorFO {
	public static void main(String[] args) {
		Calculator1 calculator1 = new Calculator1();
		System.out.println("Addition ::"+calculator1.compute(10, 20));
		System.out.println("Addition with float ::"+calculator1.compute(20,10.5f));
		System.out.println("Addition with three values::"+calculator1.compute(10,20,30));
		}

}

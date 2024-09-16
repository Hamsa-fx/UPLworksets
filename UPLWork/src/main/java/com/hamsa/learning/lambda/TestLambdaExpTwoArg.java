package com.hamsa.learning.lambda;

@FunctionalInterface
interface Add {
	int compute(int a, int b);
}

public class TestLambdaExpTwoArg {
	public static void main(String[] args) {
		Add add = (a, b) -> a + b;
		System.out.println("Total " + add.compute(10, 20));
	}

}

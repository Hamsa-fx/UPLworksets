package com.hamsa.assignment6;

public class CustomExceptionHandling {
	static void compute(int test) throws MyException {
		System.out.println("Called Compute(" + test + ")");
		if (test > 10) {
			throw new MyException(test);
		}
		System.out.println("Normal exit");
	}

	public static void main(String[] args) {
		try {
			compute(1);
			compute(20);
		} catch (MyException exception) {
			System.out.println("Caught " + exception);
		}
	}
}

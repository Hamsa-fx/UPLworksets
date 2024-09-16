package com.hamsa.assignment6;

public class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int detail;

	public MyException(int test) {
		detail = test;
	}

	public String toString() {
		return "MyException[" + detail + "]";
	}

}

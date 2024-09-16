package com.hamsa.learning.oops;

public class Calculator {
	private int firstNumber;
	private int secondNumber;

	/*
	 * public Calculator(int firstNumber,int secondNumber) { this.firstNumber =
	 * firstNumber; this.secondNumber = secondNumber; }
	 */
	public Calculator() {

	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public int add() {
		return this.firstNumber + this.secondNumber;
	}

	public int sub() {
		return this.firstNumber - this.secondNumber;
	}

	public int mul() {
		return this.firstNumber * this.secondNumber;
	}

	public float div() {
		return this.firstNumber / this.secondNumber;
	}

}

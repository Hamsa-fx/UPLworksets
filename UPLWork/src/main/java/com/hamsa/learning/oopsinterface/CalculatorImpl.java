package com.hamsa.learning.oopsinterface;

public class CalculatorImpl implements Calculator{
	private int a;
	private int b;
	public CalculatorImpl(int a, int b) {
	this.a =a;
	this.b= b;
	}
	@Override
	public int add() {
	return this.a+b;
	}
	@Override
	public int sub() {
	// TODO Auto-generated method stub
	return this.a-this.b;
	}
	@Override
	public int mul() {
	// TODO Auto-generated method stub
	return this.a*this.b;
	}
	@Override
	public int div() {
	return this.a/this.b;
	}

}

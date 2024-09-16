package com.hamsa.learning.lambda;

@FunctionalInterface
interface Square {
	int sq(int a);
}

public class TestFunSquareForms {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square = n -> n * n;
		System.out.println("square::" + square.sq(10));
		Square square1 = n -> {	return n * n;};
		System.out.println("square::" + square1.sq(20));
	}

}

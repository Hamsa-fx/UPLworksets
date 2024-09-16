package com.hamsa.learning.lambda;

public class TestLamdbaDemo1 {
	public static void main(String[] args) {
		LambdaEx lex1 = new LamdbaExImpl();
		lex1.display();
		LambdaEx lex2 = () -> System.out.println("Welcome to lambda expression");
		lex2.display();
	}
	
}

package com.hamsa.learning.lambda;

@FunctionalInterface
interface LamdbdaEx1 {
	public void display(String msg);
}

public class TestLambdaExpOneArg {
	public static void main(String[] args) {
		LamdbdaEx1 lex1 = (a) -> System.out.println(a);

		lex1.display("Vaibhavi ");
	}

}

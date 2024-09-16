package com.hamsa.assignment9;
import java.util.Stack;

public class TestStack {
	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack);
		System.out.println(stack.size());

		System.out.println("items:" + stack.pop());
		System.out.println("items:" + stack.pop());
		System.out.println("items:" + stack.pop());
		System.out.println("items:" + stack.pop());
		System.out.println(stack.size());
	}

}

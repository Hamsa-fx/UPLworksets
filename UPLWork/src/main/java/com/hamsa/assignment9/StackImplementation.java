package com.hamsa.assignment9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackImplementation {
	Stack<Integer> stack;
	String input;
	int number, index;

	public static void main(String[] args) {
		StackImplementation stack = new StackImplementation();
	}

	public StackImplementation() {
		try {
			stack = new Stack<Integer>();
			BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter number of elements : ");
			input = bufferReader.readLine();
			number = Integer.parseInt(input);
			for (int count = 1; count <= number; count++) {
				System.out.print("Enter elements : ");
				input = bufferReader.readLine();
				index = Integer.parseInt(input);
				stack.push(index);
			}
		} catch (IOException exception) {
		}
		System.out.print("Retrieved elements from the stack : ");
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}

}

package com.hamsa.assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class ReverseByWord {
	String string;

	ReverseByWord(String string) {
		this.string = string;
	}

	void display() {
		Stack stack = new Stack();
		StringTokenizer tempStringTokenizer = new StringTokenizer(string);
		while (tempStringTokenizer.hasMoreTokens()) {
			stack.push(tempStringTokenizer.nextElement());
		}
		System.out.println("Reverse of " + "'" + string + "'" + " is ");
		while (!stack.empty()) {
			System.out.print(stack.pop());
			System.out.print(" ");
		}
	}
}

public class ReverseStringByWord {
	public static void main(String[] args) throws IOException {
		String string;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		string = buffer.readLine();
		ReverseByWord reverse = new ReverseByWord(string);
		reverse.display();
	}

}

package com.hamsa.assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Tokenizer {
	String string, value;

	Tokenizer(String string) {
		this.string = string;
	}

	void display() {
		StringTokenizer tempStringTokenizer = new StringTokenizer(string);
		while (tempStringTokenizer.hasMoreTokens()) {
			value = tempStringTokenizer.nextToken();
			System.out.println("\n" + value + "\n");
		}
	}
}

public class StringParseToStringTokenizer {
	public static void main(String[] args) throws IOException {
		String string;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		string = buffer.readLine();
		Tokenizer stringToken = new Tokenizer(string);
		stringToken.display();
	}

}

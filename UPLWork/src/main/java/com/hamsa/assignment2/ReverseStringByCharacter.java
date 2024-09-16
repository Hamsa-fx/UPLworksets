package com.hamsa.assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReverseByCharacter {
	String string;

	ReverseByCharacter(String string) {
		this.string = string;
	}

	void display() {
		System.out.println(
				"Reverse of " + "'" + string + "'" + " is\n " + "'" + new StringBuilder(string).reverse() + "'");

	}
}

public class ReverseStringByCharacter {
	public static void main(String[] args) throws IOException {
		String string;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		string = buffer.readLine();
		ReverseByCharacter reverse = new ReverseByCharacter(string);
		reverse.display();
	}

}

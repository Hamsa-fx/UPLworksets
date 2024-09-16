package com.hamsa.assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ConversionCase {
	String input;
	String result;

	ConversionCase(String string) {
		this.input = string;
	}

	// Converts string into upper case
	void upperCase() {
		result = input.toUpperCase();
		System.out.println("The original string= " + input + "\n Final upper case string= " + result);

	}

	// Converts string into lower case
	void lowerCase() {
		result = input.toLowerCase();
		System.out.println("The original string= " + input + "\nFinal lower case string= " + result);

	}
}

public class CaseConversion {
	public static void main(String[] args) throws IOException {
	 String input;
	 int choice;
	 BufferedReader buffer = new BufferedReader (new InputStreamReader (System.in));
	 System.out.println ("Enter the string");
	 input = buffer.readLine();
	 ConversionCase convert = new ConversionCase (input);
	 System.out.println ("Press 1. To convert into upper case \n 	 Press 2. To convert into lower case");

	 input = buffer.readLine ();
	 choice = Integer.parseInt (input);
	 if (choice == 1) {
	 convert.upperCase ();
	 } else if (choice == 2) {
	 convert.lowerCase ();
	 } else {
	 System.out.println ("Invalid input");
	 System.exit (0);
	 }
	 }
}

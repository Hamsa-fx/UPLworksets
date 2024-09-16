package com.hamsa.assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Concatenation {

	public static void main(String args[]) throws IOException {
		String firstString, secondString;
		String concatString;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first string \n");
		firstString = buffer.readLine();
		System.out.println("Enter the second string \n");
		secondString = buffer.readLine();
		concatString = firstString.concat(secondString);
		System.out.println("Concatenated string is \n" + concatString);
	}

}

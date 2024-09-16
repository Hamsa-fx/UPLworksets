package com.hamsa.assignment2;

import java.io.*;

class SumNumbers {
	int result = 0, sizeOfArray;
	int store[] = new int[5];
	String string;

	void insert() {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the number");
			for (int count = 0; count < 5; count++) {
				string = buffer.readLine();
				store[count] = Integer.parseInt(string);
			}
		} catch (Exception exception) {
			System.out.println("Error");
		}
	}

	void sum() {
		for (int count = 0; count < 5; count++) {
			result = result + store[count];
		}
		System.out.println("Sum of numbers = " + result);
	}

}

public class SumOfNumbers {
	public static void main(String[] args) throws IOException {
		SumNumbers sumNumbers = new SumNumbers();
		sumNumbers.insert();
		sumNumbers.sum();
	}
}

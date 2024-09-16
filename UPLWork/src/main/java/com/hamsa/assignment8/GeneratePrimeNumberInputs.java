package com.hamsa.assignment8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeneratePrimeNumberInputs {
	public GeneratePrimeNumberInputs() {
		try {
			int lowerLimit, upperLimit;
			String string;
			BufferedReader buffer = new BufferedReader(new InputStreamReader(

					System.in));

			System.out.println("Enter the range of number to generate prime number");
			System.out.print("Enter the lower limit = ");
			string = buffer.readLine();
			lowerLimit = Integer.parseInt(string);
			System.out.print("Enter the upper limit = ");
			string = buffer.readLine();
			upperLimit = Integer.parseInt(string);
			PrimeNumber primeNumber = new PrimeNumber(lowerLimit, upperLimit);
			primeNumber.generate();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

}

class PrimeNumber {
	int lowerLimit, upperLimit, count;

	PrimeNumber(int lowerLimit, int upperLimit) {
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}

	void generate() {
		for (count = lowerLimit; count < upperLimit; count++) {
			int counter;
			for (counter = 2; counter < count; counter++) {
				if (count % counter == 0) {
					break;
				}
			}
			if (count == counter) {
				display(count);
			}
		}
	}

	public void display(int count) {
		System.out.print(" " + count);
	}
}
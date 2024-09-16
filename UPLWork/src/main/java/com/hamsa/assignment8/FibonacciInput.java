package com.hamsa.assignment8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciInput {
	FibonacciInput() throws IOException {
		try {
			int firstNumber = 1, secondNumber = 0, termsInSeries, result;
			BufferedReader buffer = new BufferedReader(new InputStreamReader(

					System.in));
			Fibonacci fibonacci = new Fibonacci();
			System.out.print("Enter the number of terms you want in series = ");
			String string = buffer.readLine();
			termsInSeries = Integer.parseInt(string);
			System.out.println();
			System.out.print("The fibonacci series of " + termsInSeries

					+ " terms= ");

			result = fibonacci.fibonacciSeries(termsInSeries - 1, firstNumber,

					secondNumber);
			System.out.print(result);
			System.out.println();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}

class Fibonacci {
	int firstNumber, secondNumber, temp, termsInSeries;

	int fibonacciSeries(int termsInSeries, int firstNumber, int secondNumber) {
		this.termsInSeries = termsInSeries;
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		temp = firstNumber + secondNumber;

		if (termsInSeries == 0) {
			return (temp);
		} else {
			System.out.print(temp + "\t");
			firstNumber = secondNumber;
			secondNumber = temp;
			return (fibonacciSeries(termsInSeries - 1, firstNumber,
					secondNumber));

		}
	}
}

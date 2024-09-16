package com.hamsa.learning;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit::");
		int limit = scanner.nextInt();
		System.out.println("The generated fibonacci series");
		int firstNum = 0, secondNum = 1, thirdNum = 1;
		while (thirdNum <= limit) {
			System.out.println(thirdNum);
			thirdNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = thirdNum;
		}
		scanner.close();
	}

}

package com.hamsa.learning;

import java.util.Scanner;

public class PrimeSeries {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit:");
		int limit = scanner.nextInt();
		System.out.println("The Prime Series are:");
		boolean isPrime;
		for (int incr1 = 2; incr1 <= limit; incr1++) {
			isPrime = true;
			for (int incr2 = 2; incr2 < incr1 / 2; incr2++) {
				if (incr1 % incr2 == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println(incr1);
		}
		scanner.close();
	}

}

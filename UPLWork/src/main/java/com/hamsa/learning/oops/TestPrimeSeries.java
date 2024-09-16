package com.hamsa.learning.oops;

import java.util.Scanner;

class PrimeSeries {
	private int limit;

	public PrimeSeries(int limit) {
		this.limit = limit;
	}

	public void generate() {
		System.out.println("the generated prime series are::");
		boolean isPrime;
		for (int i = 2; i < this.limit; i++) {
// 2,3,4,5,6,7,8,9
			isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println(i);
		}
	}
}

public class TestPrimeSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the limit");
		int limit = scanner.nextInt(); // limit =10
		PrimeSeries primeSeries = new PrimeSeries(limit);
		primeSeries.generate();
		scanner.close();
	}

}

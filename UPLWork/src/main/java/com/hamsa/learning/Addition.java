package com.hamsa.learning;
import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number::");
		int firstNum = scanner.nextInt();
		System.out.println("Enter the second number::");
		int secondNum = scanner.nextInt();
		int total = firstNum + secondNum;
		System.out.println("The total ::"+total);
		scanner.close();
		}

}

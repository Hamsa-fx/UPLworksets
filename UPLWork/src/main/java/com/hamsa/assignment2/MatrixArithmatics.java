package com.hamsa.assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Matrix {
	int firstMatrix[][] = new int[3][3];
	int secondMatrix[][] = new int[3][3];
	int resultMatrix[][] = new int[3][3];

	void Menu() {
		System.out.println("First matrix is::");
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++)
				System.out.print("\t" + firstMatrix[row][column]);
			System.out.println();
		}
		System.out.println("Second matrix is::");
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++)
				System.out.print("\t" + secondMatrix[row][column]);
			System.out.println();
		}
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your choice");
			System.out.print("1->Addition,2->Subtraction,3->Multiplication,4->Exit");
			String string = buffer.readLine();
			int choice = Integer.parseInt(string);
			if (choice == 1) {
				addition();
			}
			if (choice == 2) {
				subtraction();
			}
			if (choice == 3) {
				multiplication();
			}
		} catch (Exception exception) {
		}
	}

	void addition() {
		System.out.println("The addition of matrix is::");
		for (int row = 0; row < 3; row++)
			for (int column = 0; column < 3; column++)
				resultMatrix[row][column] = firstMatrix[row][column] + secondMatrix[row][column];
		System.out.println("**********************************");
		for (int count1 = 0; count1 < 3; count1++) {
			for (int count2 = 0; count2 < 3; count2++)
				System.out.print("\t" + resultMatrix[count1][count2]);
			System.out.println();
		}
		System.out.println("**********************************");
		Menu();
	}

	void subtraction() throws IOException {
		System.out.println("The subtraction of matrix is::");
		for (int count1 = 0; count1 < 3; count1++)
			for (int count2 = 0; count2 < 3; count2++)
				resultMatrix[count1][count2] = firstMatrix[count1][count2] - secondMatrix[count1][count2];

		System.out.println("**********************************");
		for (int count1 = 0; count1 < 3; count1++) {
			for (int count2 = 0; count2 < 3; count2++)
				System.out.print("\t" + resultMatrix[count1][count2]);
			System.out.println();

		}
		System.out.println("**********************************");
		Menu();
	}

	void multiplication() throws IOException {
		System.out.println("The multiplication of matrix is::");
		for (int count1 = 0; count1 < 3; count1++)
			for (int count2 = 0; count2 < 3; count2++) {
				int sum = 0;
				for (int tempCount = 0; tempCount < 3; tempCount++)
					sum = sum + firstMatrix[count1][tempCount] * secondMatrix[tempCount][count2];
				resultMatrix[count1][count2] = sum;
			}
		System.out.println("**********************************");
		for (int count1 = 0; count1 < 3; count1++) {
			for (int count2 = 0; count2 < 3; count2++)
				System.out.print("\t" + resultMatrix[count1][count2]);
			System.out.println();
		}
		System.out.println("**********************************");
		Menu();
	}
}

public class MatrixArithmatics {
	public static void main(String args[]) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		Matrix matrix = new Matrix();
		System.out.println("Enter the elements of first matrix");
		for (int count1 = 0; count1 < 3; count1++)
			for (int count2 = 0; count2 < 3; count2++) {
				String string = buffer.readLine();
				matrix.firstMatrix[count1][count2] = Integer.parseInt(string);
			}
		System.out.println("Enter the elements of second matrix");
		for (int count1 = 0; count1 < 3; count1++)
			for (int count2 = 0; count2 < 3; count2++) {
				String string = buffer.readLine();
				matrix.secondMatrix[count1][count2] = Integer.parseInt(string);
			}
		matrix.Menu();
	}

}

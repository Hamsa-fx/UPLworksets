package com.hamsa.assignment2;

import java.io.*;

class NumberSorting {
	int store[] = new int[10];
	int count, tempCount, result;

	NumberSorting(int store[]) {
		this.store = store;
	}

	void display() {
		for (count = 0; count < 10; count++) {
			for (tempCount = count + 1; tempCount < 10; tempCount++) {
				if (store[count] > store[tempCount]) {
					result = store[count];
					store[count] = store[tempCount];
					store[tempCount] = result;
				}
			}
		}
		for (count = 0; count < 10; count++) {
			System.out.print(store[count] + " ");
		}
	}
}

public class SortingNumbers {
	public static void main(String[] args) throws IOException {
		int store[] = new int[10];
		int count;
		String string;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the numbers");
		for (count = 0; count < 10; count++) {
			string = buffer.readLine();
			store[count] = Integer.parseInt(string);
		}
		NumberSorting sorting = new NumberSorting(store);
		sorting.display();
	}
}

package com.hamsa.assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StringSorting {
	String store[] = new String[5];
	int count, tempCount;
	String result;

	StringSorting(String store[]) {
		this.store = store;
	}

	void display() {
		for (count = 0; count < store.length; count++) {
			for (tempCount = count; tempCount < store.length; tempCount++) {
				if (store[tempCount].compareTo(store[count]) < 0) {
					result = store[count];
					store[count] = store[tempCount];
					store[tempCount] = result;
				}
			}
		}
		System.out.println("");
		for (count = 0; count < store.length; count++) {
			System.out.println(store[count]);
		}
	}
}

public class SortingString {
	public static void main(String[] args) throws IOException {
		String store[] = new String[10];
		int count;
		String string;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the strings");
		for (count = 0; count < 10; count++) {
			store[count] = buffer.readLine();
		}
		StringSorting sorting = new StringSorting(store);
		sorting.display();
	}
}

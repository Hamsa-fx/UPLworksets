package com.hamsa.assignment9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class QueueImplementation {

	LinkedList<Integer> list;
	String input;
	int number, index;

	public static void main(String[] args) {
		QueueImplementation queue = new QueueImplementation();
	}

	public QueueImplementation() {
		try {
			list = new LinkedList<Integer>();
			BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter number of elements : ");
			input = bufferReader.readLine();
			if ((number = Integer.parseInt(input)) == 0) {
				System.out.println("You have entered either zero/null.");
				System.exit(0);
			} else {
				System.out.println("Enter elements : ");
				for (int count = 0; count < number; count++) {
					input = bufferReader.readLine();
					index = Integer.parseInt(input);
					list.add(index);
				}
			}
			System.out.println("First element :" + list.removeFirst());
			System.out.println("Last element :" + list.removeLast());
			System.out.println("Rest elements in the list :");
			while (!list.isEmpty()) {
				System.out.print(list.remove() + "\t");
			}
		} catch (IOException exception) {
			System.out.println(exception.getMessage() + " is not a legal entry.");
			System.exit(0);
		}
	}

}

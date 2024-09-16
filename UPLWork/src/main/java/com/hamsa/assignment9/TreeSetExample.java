package com.hamsa.assignment9;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void doTreeSetExample() {
		final int MAX = 10;
		System.out.println("+--------------------------------------------------+");
		System.out.println("| Create/Store objects in a TreeSet container. |");
		System.out.println("+--------------------------------------------------+");
		System.out.println();
		Set<Integer> set = new TreeSet<Integer>();
		for (int count = 0; count < MAX; count++) {
			System.out.println(" - Storing Integer(" + count + ")");
			set.add(count);
		}
		System.out.println();
		System.out.println("+----------------------------------------------------------------+");
		System.out.println("| Retrieve objects in a TreeSet container using an Iterator. |");
		System.out.println("+----------------------------------------------------------------+");
		System.out.println();
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	public static void main(String[] args) {
		doTreeSetExample();
	}

}

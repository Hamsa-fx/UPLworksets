package com.hamsa.assignment9;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
	public static void main(String[] args) {
		SortedSet<String> sortedSet = new TreeSet<String>();
		sortedSet.add("a");
		sortedSet.add("e");
		sortedSet.add("g");
		sortedSet.add("b");
		sortedSet.add("c");
		Iterator<String> iterator = sortedSet.iterator();
		while (iterator.hasNext()) {
			String value = (String) iterator.next();
			System.out.println("Value :" + value);
		}
	}

}

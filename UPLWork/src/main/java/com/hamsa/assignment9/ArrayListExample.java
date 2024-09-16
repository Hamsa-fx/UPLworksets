package com.hamsa.assignment9;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Random;

public class ArrayListExample {
	public void doArrayListExample() {
		final int MAX = 10;
		int counter = 0;
		System.out.println ("+---------------------------------------------------------------------+");
		System.out.println ("| Create/Store objects in an ArrayList container. |");
		System.out.println ("+---------------------------------------------------------------------+");
		System.out.println();
		List<String> listA = new ArrayList<String>();
		List<String> listB = new ArrayList<String>();
//		for (int count = 0; count < MAX; count++) {
//		System.out.println(" - Storing Integer(" + count + ")");
//		listA.add(count);
//		}
		System.out.println(" - Storing String(Alex)");
		listA.add("Alex");
		System.out.println(" - Storing String(Melody)");
		listA.add("Melody");
		System.out.println(" - Storing String(Jeff)");
		listA.add("Jeff");
		System.out.println(" - Storing String(Alex)");
		listA.add("Alex");
		System.out.println();
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println("| Retrieve objects in an ArrayList container using an Iterator. |");
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println();

		Iterator iterator = listA.iterator();
		while (iterator.hasNext()) {
		System.out.println(iterator.next());
		}

		System.out.println();
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println ("| Retrieve objects in an ArrayList container using a ListIterator |");
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println();

		counter = 0;
		ListIterator listIterator = listA.listIterator();
		while (listIterator.hasNext()) {
		System.out.println("Element [" + counter + "] = " + listIterator.next());
		System.out.println(" - hasPrevious = " + listIterator.hasPrevious());
		System.out.println(" - hasNext = " + listIterator.hasNext());
		System.out.println(" - previousIndex = " + listIterator.previousIndex());
		System.out.println(" - nextIndex = " + listIterator.nextIndex());
		System.out.println();
		counter++;
		}

		System.out.println();
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println("| Retrieve objects in an ArrayList container using index. |");
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println();

		for (int count = 0; count < listA.size(); count++) {
		System.out.println("[" + count + "] - " + listA.get(count));
		}

		System.out.println();
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println("| Search for a particular Object and return its index location. |");
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println();

		int locationIndex = listA.indexOf("Jeff");
		System.out.println("Index location of the String \"Jeff\" is: " + locationIndex);

		System.out.println();
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println("| Search for an object and return the first and last (highest) index. |");
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println();

		System.out.println("First occurance search for String \"Alex\". Index = "+ listA.indexOf("Alex"));
		System.out.println("Last Index search for String \"Alex\". Index = "+ listA.lastIndexOf("Alex"));
		System.out.println();
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println("| Extract a sublist from the main list, then print the new List. |");
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println();

		List listSub = listA.subList(1, listA.size());
		System.out.println("New Sub-List from index 1 to " + listA.size() 	+ ": " + listSub);

		System.out.println();
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println("| Sort the Sub-List created above. |");
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println();

		System.out.println("Original List : " + listSub);
		Collections.sort(listSub);
		System.out.println("New Sorted List : " + listSub);
		System.out.println();

		System.out.println();
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println("| Reverse the Sub-List created above. |");
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println();
		System.out.println("Original List : " + listSub);
		Collections.reverse(listSub);
		System.out.println("New Reversed List : " + listSub);
		System.out.println();

		System.out.println();
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println("| Check to see if the Lists are empty. |");
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println();

		System.out.println ("Is List A empty? " + listA.isEmpty());
		System.out.println("Is List B empty? " + listB.isEmpty());
		System.out.println("Is Sub-List empty? " + listSub.isEmpty());

		System.out.println();
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println("| Clone the initial List. |");
		System.out.println("| NOTE: The contents of the List are object references, so both |");
		System.out.println("| of the List's contain the same exact object reference's. |");
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println();

		System.out.println("List A (before) : " + listA);
		System.out.println("List B (before) : " + listB);
		System.out.println("Sub-List (before) : " + listSub);
		System.out.println();
		System.out.println("Are List's A and B equal? " + listA.equals(listB));
		System.out.println();
		listB = new ArrayList(listA);
		System.out.println("List A (after) : " + listA);
		System.out.println("List B (after) : " + listB);
		System.out.println("Sub-List (after) : " + listSub);
		System.out.println();
		System.out.println("Are List's A and B equal? " + listA.equals(listB));

		System.out.println();
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println("| Shuffle the elements around in some Random order for List A. |");
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println();

		System.out.println("List A (before) : " + listA);
		System.out.println("List B (before) : " + listB);
		System.out.println("Sub-List (before) : " + listSub);
		System.out.println();
		System.out.println("Are List's A and B equal? " + listA.equals(listB));
		System.out.println();
		Collections.shuffle(listA, new Random());
		System.out.println("List A (after) : " + listA);
		System.out.println("List B (after) : " + listB);
		System.out.println("Sub-List (after) : " + listSub);
		System.out.println();
		System.out.println("Are List's A and B equal? " + listA.equals(listB));

		System.out.println();
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println("| Convert a List to an Array. |");
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println();

		Object[] objArray = listA.toArray();
		for (int count = 0; count < objArray.length; count++) {
		System.out.println("Array Element [" + count + "] = " + objArray[count]);
		}

		System.out.println();
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println("| Remove (clear) Elements from List A. |");
		System.out.println("+---------------------------------------------------------------------+");
		System.out.println();

		System.out.println("List A (before) : " + listA);
		System.out.println("List B (before) : " + listB);
		System.out.println();
		listA.clear();
		System.out.println("List A (after) : " + listA);
		System.out.println("List B (after) : " + listB);
		System.out.println();
	}
		public static void main(String[] args) {
		ArrayListExample listExample = new ArrayListExample();
		listExample.doArrayListExample();
		}
}

package com.hamsa.learning.Collections;

import java.util.Comparator;
import java.util.Deque;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class TestQueue {
	public static void main(String args[]) {
		Queue<String> q = new ArrayBlockingQueue<String>(5);
		q.offer("10");
		q.offer("mallik");
		q.offer("ramesh");
		q.offer("");
		System.out.println("queue items");
		for (String item : q) {
			System.out.println(item);
		}
		System.out.println("queue items before remove");
		q.poll();
		for (String item : q) {
			System.out.println(item);
		}
		System.out.println("queue items after remove");
		q.poll();
		for (String item : q) {
			System.out.println(item);
		}
		System.out.println("queue items after remove");
		q.poll();
		for (String item : q) {
			System.out.println(item);
		}
		Queue<String> q1 = new LinkedBlockingDeque<String>();
		q1.offer("10");
		q1.offer("mallik");
		q1.offer("ramesh");

		System.out.println("linked queue items");
		for (String item : q1) {
			System.out.println(item);
		}
		q1.add("ahamed");
		System.out.println("linked queue items using add");
		for (String item : q1) {
			System.out.println(item);
		}
		Deque<String> deque = new LinkedBlockingDeque<String>(5);
		deque.offer("10");
		deque.offer("mallik");
		deque.offer("ramesh");
		System.out.println("dequeue items");
		for (String item : deque) {
			System.out.println(item);
		}
		deque.addFirst("100");
		deque.addLast("300");
		System.out.println("dequeue items");
		for (String item : deque) {
			System.out.println(item);
		}
		deque.remove();
		System.out.println("dequeue items");
		for (String item : deque) {
			System.out.println(item);
		}
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("mallik");
		pq.add("amith");
		pq.add("ramesh");
		pq.add("john");
		System.out.println("Pririty queue::");
		for (String item : pq) {
			System.out.println(item);
		}
		
//		PriorityQueue<Country2> countries = new PriorityQueue<Country2>();
//		
//
//		countries.add(new Country2("zIND", "India"));
//		countries.add(new Country2("aSRI", "Srilanka"));
//		countries.add(new Country2("cAMC", "America"));
//		countries.add(new Country2("bAUS", "Australia"));
//		countries.add(new Country2("dMON", "Mongolia"));
//		countries.add(new Country2("aRUS", "Russia"));
//		System.out.println("Pririty queue countries::");
//		for (Country2 item : countries) {
//			System.out.println(item.getCode() + " :: " + item.getName());
//		}
	}

	class CodeComparator1 implements Comparator<Country2> {
		public int compare(Country2 o1, Country2 o2) {
			return o1.getCode().compareTo(o2.getCode());
		}
	}

	class NameComparator1 implements Comparator<Country2> {
		public int compare(Country2 o1, Country2 o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}

	class Country2 {
		private String name;
		private String code;

		public Country2(String code, String name) {
			this.code = code;
			this.name = name;
		}

		@Override
		public String toString() {
			return this.getCode() + "::" + this.getName();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}
	}

}

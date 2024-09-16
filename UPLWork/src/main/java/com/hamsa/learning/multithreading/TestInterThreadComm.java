package com.hamsa.learning.multithreading;

public class TestInterThreadComm {
	public static void main(String[] args) {
		Q q =new Q();
		new Producer(q);
		new Consumer(q);
	}

}

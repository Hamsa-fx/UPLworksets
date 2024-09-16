package com.hamsa.assignment8;

public class ThreadTester {
	public static void main(String args[]) {
		HelloRunner helloRunner = new HelloRunner();
	}
}

class HelloRunner implements Runnable {
	int count;

	HelloRunner() {
		Thread thread = new Thread(this);
		thread.start();
	}

	public void run() {
		count = 0;
		while (true) {
			System.out.println("Hello" + count++);
			if (count == 10) {
				break;
			}
		}
	}
}

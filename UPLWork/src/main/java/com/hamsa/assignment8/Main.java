package com.hamsa.assignment8;

class MyThread extends Thread {
	int count;

	MyThread() {
		count = 0;
	}

	public void run() {
		System.out.println("MyThread starting");
		try {
			do {
				Thread.sleep(500);
				System.out.println("In MyThread, count is " + count);
				count++;
			} while (count < 5);
		} catch (InterruptedException exception) {
			System.out.println("MyThread interrupted");
		}
		System.out.println("MyThread terminating");
	}
}

public class Main {
	public static void main(String args[]) {
		System.out.println("Main thread starting");
		MyThread myThread = new MyThread();
		myThread.start();
		do {
			System.out.println("In main thread");
			try {
				Thread.sleep(250);
			} catch (InterruptedException exception) {
				System.out.println("Main thread interrupted");
			}
		} while (myThread.count != 5);
		System.out.println("Main thread ending");
	}

}

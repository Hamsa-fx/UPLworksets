package com.hamsa.learning.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new User("Hamsa");
		new User("Ganesh");
		int count = Runtime.getRuntime().availableProcessors();
		System.out.println(count);
		ExecutorService service = Executors.newSingleThreadExecutor();

		for (int i = 0; i < 10; i++) {
			service.execute(new Task());
		}
	}

}

class Task extends Thread {
	public void run() {
		System.out.println("Hello hai");
	}
}

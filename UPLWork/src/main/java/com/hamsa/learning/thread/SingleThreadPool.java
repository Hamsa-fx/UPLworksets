package com.hamsa.learning.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPool {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 10; i++) {
			service.execute(new Task3());
		}
		System.out.println("current thread::" + Thread.currentThread().getName());
	}

}

class Task3 implements Runnable {
	public void run() {
// TODO Auto-generated method stub
		System.out.println("Thread name::" + Thread.currentThread().getName());
	}
}
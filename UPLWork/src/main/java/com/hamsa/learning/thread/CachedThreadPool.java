package com.hamsa.learning.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			service.execute(new Task1());
		}
		System.out.println("current thread::" +

				Thread.currentThread().getName());
	}

}

class Task1 implements Runnable {
	public void run() {
// TODO Auto-generated method stub
		System.out.println("Thread name::" + Thread.currentThread().getName());
	}
}

package com.hamsa.learning.thread;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = Runtime.getRuntime().availableProcessors();
		System.out.println("total available processor:" + count);
		ScheduledExecutorService service = Executors.newScheduledThreadPool(count);

		// tasks to run after every 10 seconds delay
		service.schedule(new Task(), 10, TimeUnit.SECONDS);
		// tasks to run repeat every 10 seconds
		service.scheduleAtFixedRate(new Task(), 10, 10, TimeUnit.SECONDS);
		// task to run repeatedly 10 seconds after previous tasks completes
		service.scheduleWithFixedDelay(new Task(), 15, 10, TimeUnit.SECONDS);
		System.out.println("current thread::" + Thread.currentThread().getName());

		// Change here for the hour you want --------------------------------

		// --.at()

		Long midnight = LocalDateTime.now().until(LocalDate.now().plusDays(1).atStartOfDay(), ChronoUnit.MINUTES);

		service.scheduleAtFixedRate(new Task2(), midnight, 1440, TimeUnit.MINUTES);
	}
}

class Task2 implements Runnable {
	public void run() {
// TODO Auto-generated method stub
		System.out.println("Thread name::" + Thread.currentThread().getName());
	}
}
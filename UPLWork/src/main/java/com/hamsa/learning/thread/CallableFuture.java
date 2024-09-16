package com.hamsa.learning.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableFuture {
	public static void main(String[] args) throws InterruptedException,
	ExecutionException {

	//create an array of FutureTask
		//A concrete class having implementation of both Runnable and Future is
		//called FutureTask
		FutureTask[] returnedTask = new FutureTask[5];
		//use for loop
		for(int i = 0; i < 5; i++) {
		//create an instance of Callable
		Callable callableObj = new Task5();
		//create an instance of FutureTask with Callable
		returnedTask[i] = new FutureTask(callableObj);

		// create a Thread with FutureTask
		Thread thread = new Thread(returnedTask[i]);

		thread.start();
		}
		//use for loop for printing returned value of each callable
		for(int j = 0; j < 5; j++) {
			// use get() method of FutureTask to print the returned value
			System.out.println("Callable["+j+"] ===> "+returnedTask[j].get());
			}
			}

}

class Task5 implements Callable<Object> {
	public Object call() throws InterruptedException {
// TODO Auto-generated method stub
//create an instance of the Random class

		Random obj = new Random();
//generate a random number between 0-100
		Integer number = obj.nextInt(100);
//delay thread for some random time
		Thread.sleep(number * 1000);

//return the object having the generated random number
		return number;
	}
}
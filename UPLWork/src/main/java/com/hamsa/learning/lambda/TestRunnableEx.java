package com.hamsa.learning.lambda;

public class TestRunnableEx {
	public static void main(String[] args) {
		Runnable myThreadEx = ()->{
		for(int i=0;i<10;i++) {
		System.out.println("I== "+i);}
		};
		Thread th= new Thread(myThreadEx);
		th.start();
	}
}

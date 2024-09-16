package com.hamsa.learning.multithreading;

public class Q {
	int num;
	boolean valueSet = false;

	public synchronized void getNum() {
		while (!valueSet) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("GET::" + num);
		valueSet = false;
		notify();
	}



	public synchronized void setNum(int num) {
		while (valueSet) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("PUT::" + num);
		this.num = num;
		valueSet = true;
		notify();
	}
}

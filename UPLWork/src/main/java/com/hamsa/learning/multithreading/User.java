package com.hamsa.learning.multithreading;

public class User extends Thread {
	public static ThreadLocal<Integer> uid = new ThreadLocal<Integer>() {
		protected Integer initialValue() {
			return 1;
		}

		public Integer get() {
			return super.get();
		}
	};

	public void set(Integer val) {
		uid.set(val);
	}

	public User(String name) {
		super(name);
		this.start();
	}

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("usern name::" + this.getName() + " Id::" + uid.get());

			uid.set(uid.get() + 1);
		}
	}

}

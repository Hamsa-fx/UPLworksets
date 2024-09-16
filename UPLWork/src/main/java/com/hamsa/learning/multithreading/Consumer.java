package com.hamsa.learning.multithreading;

public class Consumer implements Runnable {
	Q q;

	public Consumer(Q q) {
		super();
		this.q = q;
		Thread t = new Thread(this, "CONSUMER");
		t.start();
	}

	public Q getQ() {
		return q;
	}

	public void setQ(Q q) {
		this.q = q;
	}

	@Override
	public void run() {
// TODO Auto-generated method stub
		while (true) {
			q.getNum();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}
	}

}

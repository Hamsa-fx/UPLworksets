package com.hamsa.learning.multithreading;

public class Producer implements Runnable {
	Q q;

	public Q getQ() {
		return q;
	}

	public void setQ(Q q) {
		this.q = q;
	}

	public Producer(Q q) {
		super();
		this.q = q;
		Thread t = new Thread(this, "PRODUCER");
		t.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			q.setNum(i++);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

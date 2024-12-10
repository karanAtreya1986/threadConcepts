package com.learnings;

public class Dontgiveyieldbutgivepriority extends Thread {

	public static void main(String[] args) {

		// dont set yield()
		// give priority and check output
		// its mix and match

		Thread t1 = new Producer9();
		Thread t2 = new Consumer9();

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();

	}
}

class Producer9 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Producer value is " + i);
		}
	}
}

class Consumer9 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Consumer value is " + i);
		}
	}
}

package com.learnings;

public class Noyieldmethodbutpriorityispresent extends Thread {

	// dont call yield method but set priority,
	// output will be mix and match between both the threads.
	public static void main(String[] args) {

		Thread t1 = new Producer5();
		Thread t2 = new Consumer5();

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();

	}
}

class Producer5 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Producer value is " + i);
			// Thread.yield();
		}
	}
}

class Consumer5 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Consumer value is " + i);
			// Thread.yield();
		}
	}
}

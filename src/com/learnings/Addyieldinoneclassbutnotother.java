package com.learnings;

public class Addyieldinoneclassbutnotother extends Thread {

	// add yield in one class but not in other
	// output is mix and match

	public static void main(String[] args) {

		Thread t1 = new Producer6();
		Thread t2 = new Consumer6();

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();

	}
}

class Producer6 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Producer value is " + i);
			// Thread.yield();
		}
	}
}

class Consumer6 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Consumer value is " + i);
			Thread.yield();
		}
	}
}

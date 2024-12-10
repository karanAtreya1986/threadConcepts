package com.learnings;

public class Normalpriority extends Thread {

	public static void main(String[] args) {

		// Note-priority has values between 1-10.
		// Min priority has value 1.
		// Max priority has value 10.
		// Normal priority has value 5.

		// output is mix and match.
		Thread t1 = new Producer10();
		Thread t2 = new Consumer10();

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);

		t1.start();
		t2.start();

	}
}

class Producer10 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Producer value is " + i);
			// yield() method return type is void.
			Thread.yield();
		}
	}
}

class Consumer10 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Consumer value is " + i);
			Thread.yield();
		}
	}
}

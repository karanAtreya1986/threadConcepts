package com.learnings;

public class Withoutthreadstartmethodoutputisblank extends Thread {

	public static void main(String[] args) {

		// See how to create objects for producer and consumer. Since they extend thread
		// class we can use this.
		Thread t1 = new Producer3();
		Thread t2 = new Consumer3();

		// what is yield.
		// To surrender or give up.
		// Lets other threads run first before itself.
		// Yield is static method.

		// Set priority to minimum and maximum.
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		// when we dont give thread.start(), output is blank
		// mandatory to call run() or start() method
		// run() method without start() is already seen

	}
}

class Producer3 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Producer value is " + i);
			// yield() method return type is void.
			Thread.yield();
		}
	}
}

class Consumer3 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Consumer value is " + i);
			Thread.yield();
		}
	}
}

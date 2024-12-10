package com.learnings;

public class Anotherwaytogiveprioritywithoutthreadword extends Thread {

	public static void main(String[] args) {

		// See how to create objects for producer and consumer. Since they extend thread
		// class we can use this.
		Thread t1 = new Producer1();
		Thread t2 = new Consumer1();

		// what is yield.
		// To surrender or give up.
		// Lets other threads run first before itself.
		// Yield is static method.

		// Set priority to minimum and maximum.
		//this is another way to give priority without using the thread word
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);

		// to start the program or thread we need to use this
		// else we get blank output
		t1.start();
		t2.start();

	}
}

class Producer1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Producer value is " + i);
			// yield() method return type is void.
			Thread.yield();
		}
	}
}

class Consumer1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Consumer value is " + i);
			Thread.yield();
		}
	}
}

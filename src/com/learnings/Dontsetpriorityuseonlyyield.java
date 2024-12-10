package com.learnings;

public class Dontsetpriorityuseonlyyield extends Thread {

	public static void main(String[] args) {

		Thread t1 = new Producer8();
		Thread t2 = new Consumer8();

		//dont set priority and use only yield() method
		//output is mix and match

		t1.start();
		t2.start();

	}
}

class Producer8 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Producer value is " + i);
			// yield() method return type is void.
			Thread.yield();
		}
	}
}

class Consumer8 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Consumer value is " + i);
			Thread.yield();
		}
	}
}

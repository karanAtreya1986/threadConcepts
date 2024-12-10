package com.learnings;

public class Daemonthread extends Thread {

	public static void main(String[] args) {

		// Main thread which is created is daemon thread. also known as service provider
		// thread.

		Daemonthread o1 = new Daemonthread();
		Daemonthread o2 = new Daemonthread();
		Daemonthread o3 = new Daemonthread();

		// setdaemon() returns void
		// accepts true or false as parameter.
		o1.setDaemon(true);
		o1.start();
		o2.start();
		o3.start();
	}

	public void run() {

		// how to check if current thread is daemon or not
		// returns true or false
		if (Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread is working");
		} else {
			System.out.println("user thread is working");
		}
	}
}

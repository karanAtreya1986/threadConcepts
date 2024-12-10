package com.learnings;

public class Threadschedulerwithtime extends Thread {

	public static void main(String[] args) {
		Threadschedulerwithtime object1 = new Threadschedulerwithtime();
		Threadschedulerwithtime object2 = new Threadschedulerwithtime();

		object1.start();
		object2.start();
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				// we used the sleep method.
				// At a time only one thread runs.
				// If one thread sleeps, then another thread is picked up.

				Thread.sleep(5000);
			} catch (InterruptedException e) {
				String s1 = e.getMessage();
				System.out.println(s1);
			}
			System.out.println(i);
		}
	}

}

package com.learnings;

import java.util.concurrent.TimeUnit;

public class Threadschedulerwithtime2 extends Thread {

	public static void main(String[] args) {
		Threadschedulerwithtime2 object1 = new Threadschedulerwithtime2();
		Threadschedulerwithtime2 object2 = new Threadschedulerwithtime2();

		object1.start();
		object2.start();
	}

	public void run() {
		for (int i = 0; i < 5; i++) {

			// this is second and modern way to give sleep using time unit.
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(i);
		}
	}

}

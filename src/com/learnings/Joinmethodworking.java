package com.learnings;

public class Joinmethodworking extends Thread {

	public static void main(String[] args) {
		Joinmethodworking o1 = new Joinmethodworking();
		Joinmethodworking o2 = new Joinmethodworking();
		Joinmethodworking o3 = new Joinmethodworking();

		// Thread will run and complete execution then go back to the main thread. Join
		// will not allow other threads to stop the current thread run, join used for
		// critical functions like banking (withdraw cash etc).

		// first o1() method starts and due to the join applied
		// other threads will not interrupt it.
		// then o2() will start
		// it will run once then sleep
		// then o3() will start
		// it will run once and then sleep
		// this process continues for o2() and o3() as there is no join applied on them
		// see output for more clarity
		o1.start();

		// join() also returns void.
		// run() also returns void.
		try {
			o1.join();
		} catch (InterruptedException e) {
			String s1 = e.getMessage();
			System.out.println(s1);
		}
		o2.start();
		o3.start();
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				String s1 = e.getMessage();
				System.out.println(s1);
			}
			System.out.println(i);
		}
	}

}

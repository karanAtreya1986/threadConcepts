package com.learnings;

public class Illegalthreadstateexceptionexample extends Thread {

	public static void main(String[] args) {

		Illegalthreadstateexceptionexample o1 = new Illegalthreadstateexceptionexample();
		Illegalthreadstateexceptionexample o2 = new Illegalthreadstateexceptionexample();

		// we have to first set the daemon thread to true or false
		// then start() it
		// else if we first start() and then setdaemon() we get illegal thread state
		// exception.
		o1.start();
		o1.setDaemon(true);
		o2.start();
	}

	public void run() {

		// how to get the thread name
		String s1 = Thread.currentThread().getName();
		System.out.println(s1);

		// check if thread is daemon
		boolean b1 = Thread.currentThread().isDaemon();
		System.out.println(b1);
	}
}

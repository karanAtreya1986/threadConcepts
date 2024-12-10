package com.learnings;

public class Gethreadnameandcheckifdaemon extends Thread {

	public static void main(String[] args) {

		Gethreadnameandcheckifdaemon o1 = new Gethreadnameandcheckifdaemon();
		Gethreadnameandcheckifdaemon o2 = new Gethreadnameandcheckifdaemon();

		o1.setDaemon(true);
		o1.start();
		o2.start();
	}

	public void run() {
		
		//how to get the thread name
		String s1=Thread.currentThread().getName();
		System.out.println(s1);
		
		//check if thread is daemon
		boolean b1=Thread.currentThread().isDaemon();
		System.out.println(b1);
	}
}

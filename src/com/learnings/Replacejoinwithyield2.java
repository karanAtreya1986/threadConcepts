package com.learnings;

public class Replacejoinwithyield2 extends Thread {

	public static void main(String[] args) {
		Replacejoinwithyield2 o1 = new Replacejoinwithyield2();
		Replacejoinwithyield2 o2 = new Replacejoinwithyield2();
		Replacejoinwithyield2 o3 = new Replacejoinwithyield2();

		// even after commenting the start() method of o1
		// this time we get only outputs for o2 and o3.
//		o1.start();
		o1.yield();
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

package com.learnings;

public class Replacejoinwithyield extends Thread {

	public static void main(String[] args) {
		Replacejoinwithyield o1 = new Replacejoinwithyield();
		Replacejoinwithyield o2 = new Replacejoinwithyield();
		Replacejoinwithyield o3 = new Replacejoinwithyield();

		o1.start();
		// we can access yield using object names
		// though java gives warning that its static
		// The static method yield() from the type Thread should be accessed in a static
		// way
		// classname is best for accessing.

		// here all runs one after other.
		
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

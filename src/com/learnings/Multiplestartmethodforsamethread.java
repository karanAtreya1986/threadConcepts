package com.learnings;

public class Multiplestartmethodforsamethread extends Thread {

	public static void main(String[] args) {
		Multiplestartmethodforsamethread m1 = new Multiplestartmethodforsamethread();
		m1.start(); //first this method runs, then calls run().
		m1.start(); //as soon as this line comes, then error - illegal thread state exception.
	}

	public void run() {
		System.out.println("thread is running");
	}

}

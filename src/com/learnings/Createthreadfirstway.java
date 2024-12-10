package com.learnings;

//note - we need to have the same version of java se as jdk.

//i had jdk11 but selected javase23, so Thread was throwing error.
//compiler error will come.

//extend thread class
public class Createthreadfirstway extends Thread {
	public static void main(String[] args) {

		// create object of the class extending thread
		Createthreadfirstway t1 = new Createthreadfirstway();
		// start thread
		t1.start();
	}

	// run will have business logic and this will be the thread run
	public void run() {
		System.out.println("thread is running");
	}
}

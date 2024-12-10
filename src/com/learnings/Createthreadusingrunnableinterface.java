package com.learnings;

//second way to create thread
//implement the interface.
public class Createthreadusingrunnableinterface implements Runnable {

	// we have to override the run method from interface.
	@Override
	public void run() {
		System.out.println("thread is running");

	}

	public static void main(String[] args) {
		// create object of class
		Createthreadusingrunnableinterface t1 = new Createthreadusingrunnableinterface();
		// create object of thread and pass our class object implementing runnable
		Thread t2 = new Thread(t1);
		// start method of thread
		t2.start();
	}

}

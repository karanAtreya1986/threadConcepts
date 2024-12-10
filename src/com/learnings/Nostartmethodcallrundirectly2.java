package com.learnings;

public class Nostartmethodcallrundirectly2 extends Thread {

	public static void main(String[] args) {
		Nostartmethodcallrundirectly2 object1 = new Nostartmethodcallrundirectly2();
		object1.start();
	}

	// this works fine from external looks.
	// internally its not proper.
	// start() creates separate thread call stack for every new process. Calling
	// run()
	// directly is like calling normal method, so same thread call stack used, which
	// defeats
	// the purpose of threading.

	// call stack created for thread.
	// run in debug mode to observe.
	public void run() {
		System.out.println("running thread");
	}

}

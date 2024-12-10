package com.learnings;

public class Runmethodcalledtwicewithoutstart extends Thread{

	public static void main(String[] args) {
		Runmethodcalledtwicewithoutstart object1=new Runmethodcalledtwicewithoutstart();
		Runmethodcalledtwicewithoutstart object2=new Runmethodcalledtwicewithoutstart();
		
		//No start() method
//		/Run() method twice
		
		//both threads work one after other. see output.
		object1.run();
		object2.run();
	}
	
	//Threads always throw interrupted exception
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				String s1=e.getMessage();
				System.out.println(s1);
			}
			System.out.println(i);
		}
	}
}

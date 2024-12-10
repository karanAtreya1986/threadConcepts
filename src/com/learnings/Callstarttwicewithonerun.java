package com.learnings;

public class Callstarttwicewithonerun extends Thread{

	public static void main(String[] args) {
		Callstarttwicewithonerun object1=new Callstarttwicewithonerun();
		Callstarttwicewithonerun object2=new Callstarttwicewithonerun();
		
		//first thread starts then runs 
		//then sleeps
		//then second thread starts and runs
		//then second thread sleeps and so on
		//see the output
		object1.start();
		object2.start();
	
	}
	
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

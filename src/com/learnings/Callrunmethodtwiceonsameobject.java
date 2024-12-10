package com.learnings;

public class Callrunmethodtwiceonsameobject extends Thread{

	public static void main(String[] args) {
		Callrunmethodtwiceonsameobject object1=new Callrunmethodtwiceonsameobject();
		Callrunmethodtwiceonsameobject object2=new Callrunmethodtwiceonsameobject();
		
		//same call stack
		//first object runs
		//then second object runs
		object1.run();
		object1.run();
	
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

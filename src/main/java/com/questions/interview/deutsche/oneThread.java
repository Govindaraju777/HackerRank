package com.questions.interview.deutsche;
// Java program to illustrate 

public class oneThread extends Thread {

	int i = 0;

	public oneThread(String name) {
		this.setName(name);
	}

	public void run() {
		try {
			Thread.sleep(300);
			for(int j=0;j<=100;j++) {
				System.out.println("geeks " + "ThreadName=" + Thread.currentThread().getName());
			}
		} //catch (InterruptedException ie) {
			catch (Exception ie) {
		}
		System.out.println("forgeeks "  + "ThreadName=" + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		oneThread c1 = new oneThread("FirstThread");
		oneThread c2 = new oneThread("SecondThread");
		c1.start();
		
		try {
			c1.join(); // Waiting for c1 to finish
			//c2.join(); // Waiting for c2 to finish
		} catch (InterruptedException ie) {
		}
		c2.start();
		
	}
}

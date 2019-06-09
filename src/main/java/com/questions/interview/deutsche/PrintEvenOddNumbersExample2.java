package com.questions.interview.deutsche;

public class PrintEvenOddNumbersExample2 {
	private int number = 1;

	public static void main(String[] args) {
		PrintEvenOddNumbersExample2 object = new PrintEvenOddNumbersExample2();

		Runnable jbo1 = () -> {
			object.printOdd();
		};
		Runnable jbo2 = () -> {
			object.printEven();
		};

		Thread t1 = new Thread(jbo1);
		Thread t2 = new Thread(jbo2);

		t1.start();
		t2.start();

	}

	public void printOdd() {
		synchronized (this) {
			try {
				while (number <= 49) {
					System.out.print(" " + number++);
					wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void printEven() {
		synchronized (this) {
			while (number <= 50) {
				System.out.print(" " + number++);
				notify();
			}
		}
	}

}

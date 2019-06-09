package com.questions.interview.deutsche;

public class PrintEvenOddNumbers {

	private boolean odd = true;

	public static void main(String[] args) {
		PrintEvenOddNumbers object = new PrintEvenOddNumbers();

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
			for (int i = 1; i <= 49; i += 2) {
				try {
					// Thread.sleep(1000);
					if (!odd) {
						wait();
					}
					System.out.print(" " + i);
					odd = false;
					notify();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void printEven() {
		synchronized (this) {
			for (int i = 2; i <= 50; i += 2) {
				// Thread.sleep(1000);
				if (odd) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.print(" " + i);
				odd = true;
				notify();
			}
		}
	}

}

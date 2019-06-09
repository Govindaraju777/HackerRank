package com.questions.interview.capco;

import org.apache.poi.ss.formula.functions.Sumif;

public abstract class AbstractClassMain {
	public static void main(String[] args) {
		System.out.println("AbstractClassMain");
		
		AbstractClassMain cls= new AbstractClassMain() 
		{
			
		};
		System.out.println("sum: " + cls.sum(1,2));
	}

	private int sum(int a, int b) {
		return a + b;
	}
}

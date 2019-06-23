package com.questions.interview.e2open;

public class TestMethod {

	TestMethod() {
		System.out.println("TestMethod");
	}

	TestMethod(int num) {
		System.out.println("hello int");
	}

	TestMethod(double num) {
		System.out.println("hello double");
	}

	TestMethod(Integer num) {
		System.out.println("hello Integer");
	}

	public static void main(String[] args) {
		TestMethod t1 = new TestMethod(5);
	}
}

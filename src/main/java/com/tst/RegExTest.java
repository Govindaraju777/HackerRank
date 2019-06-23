package com.tst;

public class RegExTest {
	public static void main(String[] args) {
		boolean ismathc = "Hello World".matches("(?i)Hello world");
		System.out.println(ismathc);
	}
}

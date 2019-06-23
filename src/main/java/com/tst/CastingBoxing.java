package com.tst;

public class CastingBoxing {
	public static void main(String[] args) {
		int i = 1;
		long l = i; // implicit casting
		int i2 = (int) l;

		// 62. How do you convert String to int in Java?
		String n1s = "1";
		int si1 = Integer.parseInt(n1s);
		Integer i1 = Integer.valueOf(si1);
	}
}

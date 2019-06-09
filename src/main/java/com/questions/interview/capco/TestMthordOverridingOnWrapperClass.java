package com.questions.interview.capco;

public class TestMthordOverridingOnWrapperClass {
	public static void main(String[] args) {
		String s1 = "govind";
		StringBuffer sb = new StringBuffer(s1);
		// System.out.println("s1==s2" + s1 == sb); // Incompatible operand
		// types String and StringBuffer

		// example for overriding Object type - //Benz
		Overriding ov1 = new Overriding();
		ov1.test(new Integer(1));
		ov1.test(null);
		ov1.test(new Object());

		// Capco
		// ov1.capco(null); //The method capco(String) is ambiguous for the type
		// Overriding
		Integer i = null;
		ov1.capco(i);
		Object o = null;
	}
}

class Overriding {
	
	//Benz
	public void test(Object obj) {
		System.out.println("test(Object obj");
	}

	public void test(String s) {
		System.out.println("test(String obj");
	}

	// capco
	public void capco(String Str) {
		System.out.println("capco Str");
	}

	public void capco(Integer i) {
		System.out.println("capco integer");
	}

}
package com.questions.interview.emc;

public class Test {
	public static void main(String[] args) {
		String s1 = "govind";
		StringBuffer sb = new StringBuffer(s1);
		//System.out.println("s1==s2" + s1 == sb);  // Incompatible operand types String and StringBuffer
		
		// example for overriding Object type
		Overriding ov1 = new Overriding();
		ov1.test(new Integer(1));
		ov1.test(null);
		ov1.test(new Object());
		
		
		//Capco
		//ov1.capco(null); //The method capco(String) is ambiguous for the type Overriding
		Integer i = null;
		ov1.capco(i);
		Object o = null;
		
		//emc
		//ov1.emc(null, null); //The method emc(Integer, Integer) is ambiguous for the type Overriding
		ov1.emc(null, null);
	}
}

class Overriding {
	public void test(Object obj) {
		System.out.println("test(Object obj");
	}

	public void test(String s) {
		System.out.println("test(String obj");
	}
	
	//capco
	public void capco(String Str) {
		System.out.println("capco Str");
	}

	public void capco(Integer i) {
		System.out.println("capco integer");
	}
	
	
	/*
	//emc
	//ov1.emc(null, null); //The method emc(Integer, Integer) is ambiguous for the type Overriding
	public void emc(String s1,String s2) {
		System.out.println("emc i1 i2");
	}*/
	public void emc(Object o1,Object o2) {
		System.out.println("emc o1 o2");
	}
	//emc
	public void emc(Integer i1,Integer i2) {
		System.out.println("emc non Object type method.");
	}
	
}
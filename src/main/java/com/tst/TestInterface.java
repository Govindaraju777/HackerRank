package com.tst;

import java.util.ArrayList;
import java.util.List;

public class TestInterface implements TestI {
	public static void main(String[] args) {
		TestInterface o1 = new TestInterface();
		System.out.println("s = " + o1.s);
		System.out.println("s4 = " + o1.s4);
		System.out.println("s4 = " + TestI.s4);
		System.out.println("s4 = " + TestInterface.s4);
		
		List<Integer> strings = new ArrayList<>();
		strings.add(1); //Autoboxing and unboxing can happen where an object is expected and primitive type is provided.
		
	}
}
interface TestI {
	String s = "";
	// String s2; //compiler Error : The blank final field s2 may not have been initialized
	//private String s3 = ""; // Illegal modifier for the interface field TestI.s3; 
				//only public, static & final are permitted
	public static String s4 = "";
	
	//protected String test(); //Illegal modifier for the interface method test; 
				//only public, abstract, default, static and strictfp are permitted
	//public abstract String test();
	
}
package com.questions.interview.genpack;

public class PrimitiveWrapperOverLoading {

	public static void main(String[] args) {
		test(1);
		
		test(1L);
		
		test(1.0);
	}
	
	private static void test(int i) {
		System.out.println("test primitive");
	}
	private static void test(Integer i) {
		System.out.println("test Integer");
	}
	private static void test(Long i) {
		System.out.println("test Long");
	}
	/*private static void test(Object i) {
		System.out.println("test Object");
	}*/
	private static <T> void test(T i) {
		System.out.println("test Generic");
	}
	
}

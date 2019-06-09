package com.questions.interview.capco;


/*
 Given immutable class
 How to add new attribute / field as per client requirement.
 Ans : Add overridden constructor..
 
 */
public class ImmutableClass {

	private String name;
	private String id;
	private int salary;
	
	ImmutableClass(String name,String id){};
	ImmutableClass(String name,String id,int salary){}; // new client requirement.
	
}

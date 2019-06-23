package com.questions.interview.e2open;

public class InheritanceExample {
	SuperClass a=new SuperClass();
	Subclass b=new Subclass();
	
	//q1 : 
	//a=b; //Syntax error on token "=", => expected
	
	
	//Q2:
	//Subclass c= (Subclass)a; //Cannot cast from SuperClass to Subclass
	
	SuperClass d= (SuperClass)a;  

	
}


class SuperClass {}
class Subclass extends SuperClass {};
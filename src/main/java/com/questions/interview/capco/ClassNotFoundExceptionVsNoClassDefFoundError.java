package com.questions.interview.capco;

/*
 ClassNotFoundException and NoClassDefFoundError both occur when class is not found at runtime. 
 They are related to Java classpath. 
  https://www.geeksforgeeks.org/classnotfoundexception-vs-noclassdeffounderror-java/
  
  ClassNotFoundException:
  	ClassNotFoundException occurs when you try to load a class at runtime using Class.forName() or loadClass() methods and requested classes are not found in classpath. Most of the time this exception will occur when you try to run application without updating classpath with JAR files
  	 This exception is a checked Exception derived from java.lang.Exception class and you need to provide explicit handling for it. 
  NoClassDefFoundError:
  	NoClassDefFoundError occurs when class was present during compile time and program was compiled and linked successfully but class was not present during runtime.
  	 It is error which is derived from LinkageError. 
  
  
	As the name suggests, ClassNotFoundException is an exception while NoClassDefFoundError is an error.
	ClassNotFoundException occurs when classpath is does not get updated with required JAR files while error occurs when required class definition is not present at runtime.
  
 */
public class ClassNotFoundExceptionVsNoClassDefFoundError {
	public static void main(String args[]) {
		try {
			Class.forName("GeeksForGeeks");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}

// Java progra to illustrate

// NoClassDefFoundError
class GeeksForGeeks {
	void greeting() {
		System.out.println("hello!");
	}
}

class G4G {
	public static void main(String args[]) {
		GeeksForGeeks geeks = new GeeksForGeeks();
		geeks.greeting();
	}
}
/*
 * Above program will be successfully compiled and generate two classes
 * GeeksForGeeks.class and G4G.class. Now remove GeeksForGeeks.class file and
 * run G4G.class. At Java runtime NoClassDefFoundError will be thrown.
 */
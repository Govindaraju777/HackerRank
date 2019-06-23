package com.questions.interview.societyGenerale;

public class MethodsInObjectClass {

	Object o1 = new Object();
	
	
	//https://docs.oracle.com/javase/tutorial/java/IandI/objectclass.html
	
	/*
			 
		Object as a Superclass
		The Object class, in the java.lang package, sits at the top of the class hierarchy tree. Every class is a descendant, direct or indirect, of the Object class. Every class you use or write inherits the instance methods of Object. You need not use any of these methods, but, if you choose to do so, you may need to override them with code that is specific to your class. The methods inherited from Object that are discussed in this section are:
		
		protected Object clone() throws CloneNotSupportedException
		      Creates and returns a copy of this object.
		public boolean equals(Object obj)
		      Indicates whether some other object is "equal to" this one.
		protected void finalize() throws Throwable
		      Called by the garbage collector on an object when garbage
		      collection determines that there are no more references to the object
		public final Class getClass()
		      Returns the runtime class of an object.
		public int hashCode()
		      Returns a hash code value for the object.
		public String toString()
		      Returns a string representation of the object.
		The notify, notifyAll, and wait methods of Object all play a part in synchronizing the activities of independently running threads in a program, which is discussed in a later lesson and won't be covered here. There are five of these methods:
		
		public final void notify()
		public final void notifyAll()
		public final void wait()
		public final void wait(long timeout)
		public final void wait(long timeout, int nanos)

	 */
	
}

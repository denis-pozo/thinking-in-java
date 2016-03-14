package org.denispozo.tutorial.thj.reusing.classes;

import org.denispozo.tutorial.thj.reusing.classes.protecting.ClassWithProtectedMethod; 

/*
 * Chapter - Reusing Classes
 * Section - Protected
 * Exercise 15 
 */

public class CallingProtectedMethodWrong {

	@SuppressWarnings("unused")
	public static void main(String [] args) { 
		ClassWithProtectedMethod object = new ClassWithProtectedMethod();
		/* object.protectedMethod(); This method is invisible from this class
		 * because it is outside the package, where it was defined 
		 */ 
	}
}

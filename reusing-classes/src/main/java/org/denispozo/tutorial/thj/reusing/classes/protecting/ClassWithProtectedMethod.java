package org.denispozo.tutorial.thj.reusing.classes.protecting;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Reusing Classes
 * Section - Protected
 * Exercise 15 
 */

public class ClassWithProtectedMethod {

	protected boolean protectedMethod() {
		print("Protected method has been called !!!");
		return true;
	}
}

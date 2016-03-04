package org.denispozo.tutorial.thj.access.control.packages.accessors;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Access Control
 * Section - Java Access Specifiers
 * Exercise 5
 */

public class AllAccessorsInOneTester {

	public static void main(String [] args) {
		AllAccessorsInOne object = new AllAccessorsInOne();
		
		print("Trying to access to " + object.publicField);
		print("Trying to access to " + object.protectedField);
//		print("Trying to access to " + object.privateField);
		
		object.publicMethod();
		object.protectedMethod();
//		object.privateMethod();
	}
	
}

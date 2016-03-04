package org.denispozo.tutorial.thj.access.control.packages.debugoff;

import static org.denispozo.tutorial.thj.util.Print.print;

/*
 * Chapter - Access Control
 * Section - Using Imports to change behavior
 * Exercise 3
 */

public class IdenticalClass {

	public static void debug(String message) {
		print("debugoff - doing nothing");
	}
	
}

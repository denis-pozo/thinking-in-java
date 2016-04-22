package org.denispozo.tutorial.thj.access.control.packages.debug;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Access Control
 * Section - Using Imports to change behavior
 * Exercise 3
 */

public class IdenticalClass {

	public static void debug(String message) {
		print("debug-on: " + message);
	}
	
}

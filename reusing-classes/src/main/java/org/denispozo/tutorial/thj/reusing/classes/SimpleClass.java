package org.denispozo.tutorial.thj.reusing.classes;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Reusing Classes
 * Section - Composition Syntax
 * Exercise 1
 */

public class SimpleClass {
	
	public SimpleClass() {
		print("Inside SimpleClass constructor");
	}
	
	public String toString () {
		return "I am the SimpleClass class";
	}
}

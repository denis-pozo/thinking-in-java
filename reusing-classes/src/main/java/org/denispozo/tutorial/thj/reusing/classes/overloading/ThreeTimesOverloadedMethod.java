package org.denispozo.tutorial.thj.reusing.classes.overloading;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Reusing Classes
 * Section - Name hiding
 * Exercise 13
 */

public class ThreeTimesOverloadedMethod {
	
	void hello() {
		print("Hello ");
	}
	
	void hello(String name) {
		print("Hello! I'm " + name);
	}
	
	void hello(String name, int age) {
		print("Hello! I'm " + name + " and I'm " + age + " years old");
	}
}

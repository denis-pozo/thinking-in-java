package org.denispozo.tutorial.thj.reusing.classes.overloading;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Reusing Classes
 * Section - Name hiding
 * Exercise 13
 */
class ExtendingOveloadedSuprem extends ThreeTimesOverloadedMethod {
	
	void hello(String name, int age, String nation) {
		print("Hello! I'm " + name + " and I'm " + age + " years old, from " + nation);
	}
	
	public static void main(String [] args) {
		ExtendingOveloadedSuprem eos = new ExtendingOveloadedSuprem();
		eos.hello();
		eos.hello("Alice");
		eos.hello("Alice", 243);
		eos.hello("Alice", 243, "Spain");
	}
}

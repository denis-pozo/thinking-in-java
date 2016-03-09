package org.denispozo.tutorial.thj.reusing.classes.abcarguments;

/*
 * Chapter - Reusing Classes
 * Section - Initializing the base class
 * Exercise 5
 */

public class C extends A {
	
	@SuppressWarnings("unused")
	private B b;

	public C() {
		super(0);
		b = new B(1);
	}
}

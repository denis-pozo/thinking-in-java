package org.denispozo.tutorial.thj.reusing.classes;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Reusing Classes
 * Section - Initializing the base class
 * Exercise 8 
 */

public class DerivedClass extends BaseClass {

	public DerivedClass() {
		super(0);
		print("DerivedClass default constructor");
	}
	
	public DerivedClass(int i) {
		super(i);
		print("DerivedClass non-default constructor");		
	}
}

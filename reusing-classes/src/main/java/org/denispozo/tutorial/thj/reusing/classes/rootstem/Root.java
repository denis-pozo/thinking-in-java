package org.denispozo.tutorial.thj.reusing.classes.rootstem;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Reusing Classes
 * Section - Initializing the base class
 * Exercise 9 
 */

public class Root {

	@SuppressWarnings("unused")
	private Component1 component1;
	@SuppressWarnings("unused")
	private Component2 component2;
	@SuppressWarnings("unused")
	private Component3 component3;
	
	public Root() {
		print("Root constructor");
		component1 = new Component1();
		component2 = new Component2();
		component3 = new Component3();
	}
	
}

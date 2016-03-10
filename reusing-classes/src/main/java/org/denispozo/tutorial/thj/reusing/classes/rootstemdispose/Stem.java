package org.denispozo.tutorial.thj.reusing.classes.rootstemdispose;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Reusing Classes
 * Section - Guaranteeing proper cleanup
 * Exercise 12 
 */

class Stem extends Root {
	
	private Component1 component1;
	private Component2 component2;
	private Component3 component3;
	
	Stem() {
		print("Stem constructor");
		component1 = new Component1();
		component2 = new Component2();
		component3 = new Component3();
	}
	
	void dispose() {
		print("Stem.dispose()");
		component3.dispose();
		component2.dispose();
		component1.dispose();
		super.dispose();
	}
	
	public static void main(String [] args) {
		Stem stem = new Stem();
		stem.dispose();
	}
	
}

package org.denispozo.tutorial.thj.reusing.classes.rootstemdispose;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Reusing Classes
 * Section - Guaranteeing proper cleanup
 * Exercise 12 
 */

class Component2 {
	
	Component2() {
		print("Component2 constructor");
	}
	
	void dispose() {
		print("Erasing Component2");
	}
}

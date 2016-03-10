package org.denispozo.tutorial.thj.reusing.classes.rootstemdispose;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Reusing Classes
 * Section - Guaranteeing proper cleanup
 * Exercise 12 
 */

class Component1 {

	Component1() {
		print("Component1 constructor");
	}
	
	void dispose() {
		print("Erasing Component1");
	}
}

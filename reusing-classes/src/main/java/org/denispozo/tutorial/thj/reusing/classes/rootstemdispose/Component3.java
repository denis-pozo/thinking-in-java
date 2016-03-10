package org.denispozo.tutorial.thj.reusing.classes.rootstemdispose;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Reusing Classes
 * Section - Guaranteeing proper cleanup
 * Exercise 12 
 */

class Component3 {
	
	Component3() {
		print("Component3 constructor");
	}

	void dispose() {
		print("Erasing Component3");
	}
}

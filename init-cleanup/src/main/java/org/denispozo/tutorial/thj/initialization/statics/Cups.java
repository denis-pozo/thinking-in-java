package org.denispozo.tutorial.thj.initialization.statics;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Initialization & Cleanup
 * Section - Default Constructors
 * Exercise 13
 */

public class Cups {

	static Cup cup1;
	static Cup cup2;
		
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	
	Cups(){
		print("Cups()");
	}

}

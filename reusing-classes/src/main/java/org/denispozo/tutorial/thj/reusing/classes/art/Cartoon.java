package org.denispozo.tutorial.thj.reusing.classes.art;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Reusing Classes
 * Section - Initializing the base class
 * Exercise 3
 */

public class Cartoon extends Drawing {
	
	public static void main(String [] args) {
		@SuppressWarnings("unused")
		Cartoon x = new Cartoon();
		print("Tested - Art and Drawing constructors were called");
	}

}

package org.denispozo.tutorial.thj.initialization.constructor.def;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Initialization & Cleanup
 * Section - Default Constructors
 * Exercise 7
 */

public class ClassWithoutConstructor {
	
	public static void main(String [] args){
		ClassWithoutConstructor seven = new ClassWithoutConstructor();
		print("Does seven (class instance) exist???");
		print("Yes - " + seven.toString());
	}
}

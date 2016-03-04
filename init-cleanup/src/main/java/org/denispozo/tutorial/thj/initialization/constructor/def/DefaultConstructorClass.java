package org.denispozo.tutorial.thj.initialization.constructor.def;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Initialization & Cleanup
 * Section - Default Constructors
 * Exercise 3
 */

public class DefaultConstructorClass {
	
	public DefaultConstructorClass(){
		print("Hey guys, how are you doing?");
	}
	
	public static void main(String [] args){		
		DefaultConstructorClass constructor = new DefaultConstructorClass();
		print(constructor.toString());
	}
	
}

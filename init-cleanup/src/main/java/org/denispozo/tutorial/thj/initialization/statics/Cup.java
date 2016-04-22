package org.denispozo.tutorial.thj.initialization.statics;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Initialization & Cleanup
 * Section - Default Constructors
 * Exercise 13
 */

public class Cup{
	
	Cup(int marker){
		print("Cup(" + marker +")");
	}
		
	void function(int marker){
		print("Function(" + marker +")");
	}
}

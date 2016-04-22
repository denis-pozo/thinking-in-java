package org.denispozo.tutorial.thj.polymorphism.transport;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Polymorphism
 * Section - Upcasting Revisited
 * Exercise 1 and 5
 */

public class Cycle {

	public int wheels() { 
		return 0;
	}
	
	public void ride() {  
		print("Riding with " + wheels() + " wheel(s)");
	}
	
}

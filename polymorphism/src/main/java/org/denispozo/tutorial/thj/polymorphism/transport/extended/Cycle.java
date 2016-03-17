package org.denispozo.tutorial.thj.polymorphism.transport.extended;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Polymorphism
 * Section - Substitution vs. Extension
 * Exercise 17
 */

public class Cycle {

	public int wheels() { 
		return 0;
	}
	
	public void ride() {  
		print("Riding with " + wheels() + " wheel(s)");
	}
	
	public static void main(String [] args) {
		Cycle [] cycles = { 
				new Tricycle(),
				new Unicycle(),
				new Bicycle()
		};
		// Compilation error - balance is not visible for the base class
		// cycles[0].balance();
		//((Unicycle) cycles[0]).balance(); // Throws a ClassCastException - Tricycle is not Unicycle
		((Unicycle) cycles[1]).balance();
		((Bicycle) cycles[2]).balance();
	}
}

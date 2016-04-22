package org.denispozo.tutorial.thj.reusing.classes.cleaning;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Reusing Classes
 * Section - Inheritance Syntax
 * Exercise 2
 */

public class Detergent extends Cleanser {
	
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub();
	}
	
	public void foam() {
		append(" foam()");
	}
	
	public static void main(String [] args) {
		Detergent detergent = new Detergent();
		detergent.dilute();
		detergent.apply();
		detergent.scrub();
		detergent.foam();
		print(detergent);
		print("Testing base clase: ");
		Cleanser.main(args);
	}
}

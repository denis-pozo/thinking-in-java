package org.denispozo.tutorial.thj.reusing.classes.cleaning;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Reusing Classes
 * Section - Inheritance Syntax
 * Exercise 2
 */

public class Bleach extends Detergent {
	
	public void scrub() {
		append(" Bleach.scrub()");
		super.scrub();
	}
	
	public void sterilize() {
		append(" sterilize()");
	}
	
	public static void main(String [] args) {
		Bleach bleach = new Bleach();
		bleach.dilute();
		bleach.apply();
		bleach.scrub();
		bleach.sterilize();
		print(bleach);
		print("Testing base clase: ");
		Detergent.main(args);
		print("Testing base-base clase: ");
		Cleanser.main(args);
	}

}

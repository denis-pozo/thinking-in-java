package org.denispozo.tutorial.thj.reusing.classes.cleaning;

import static org.denispozo.tutorial.thj.util.Print.*; 


/*
 * Chapter - Reusing Classes
 * Section - Delegation
 * Exercise 10
 */

public class DetergentDelegation {
	
	Cleanser cleanser;
	
	public DetergentDelegation() {
		cleanser = new Cleanser();
	}
	
	public void dilute() {
		cleanser.dilute();
	}

	public void apply() {
		cleanser.apply();
	}
	
	public void scrub() {
		cleanser.append(" Detergent.scrub()");
		cleanser.scrub();
	}
	
	public String toString() {
		return cleanser.toString();
	}
	
	public void foam() {
		cleanser.append(" foam()");
	}
	
	
	public static void main(String [] args) {
		DetergentDelegation detergent = new DetergentDelegation();
		detergent.dilute();
		detergent.apply();
		detergent.scrub();
		detergent.foam();
		print(detergent);
		print("Testing base clase: ");
		Cleanser.main(args);
	}
}
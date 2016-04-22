package org.denispozo.tutorial.thj.polymorphism.rodent;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Polymorphism
 * Section - Extensibility
 * Exercise 8
 */

public class Gerbil extends Rodent {
	
	public Gerbil() {
		print("Gerbil()");
	}

	public void gnaw() {
		print("Gerbil.gnaw()");
	}
	
	public void sniff() {
		print("Gerbil.sniff()");
	}
}

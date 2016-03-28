package org.denispozo.tutorial.thj.interfaces.rodents;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Interfaces
 * Section - Abstract classes and methods
 * Exercise 1
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

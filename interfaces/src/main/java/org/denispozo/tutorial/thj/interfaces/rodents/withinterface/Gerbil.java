package org.denispozo.tutorial.thj.interfaces.rodents.withinterface;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Interfaces
 * Section - Interfaces
 * Exercise 7
 */

public class Gerbil implements Rodent {
	
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

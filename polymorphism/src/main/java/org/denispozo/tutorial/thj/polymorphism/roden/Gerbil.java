package org.denispozo.tutorial.thj.polymorphism.roden;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Polymorphism
 * Section - Extensibility
 * Exercise 8
 */

public class Gerbil extends Rodent {

	public void gnaw() {
		print("Gerbil.gnaw()");
	}
	
	public void sniff() {
		print("Gerbil.sniff()");
	}
}

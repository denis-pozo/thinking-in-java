package org.denispozo.tutorial.thj.polymorphism.rodent;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Polymorphism
 * Section - Extensibility
 * Exercise 8
 */

public class Hamster extends Rodent {
	
	public Hamster() {
		print("Hamster()");
	}
	
	public void gnaw() {
		print("Hamster.gnaw()");
	}
	
	public void sniff() {
		print("Hamster.sniff()");
	}
}

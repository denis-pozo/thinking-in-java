package org.denispozo.tutorial.thj.interfaces.rodents.withinterface;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Interfaces
 * Section - Interfaces
 * Exercise 7
 */

public class Hamster implements Rodent {
	
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

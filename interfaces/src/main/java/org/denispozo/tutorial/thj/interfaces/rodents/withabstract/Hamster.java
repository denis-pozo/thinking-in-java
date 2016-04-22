package org.denispozo.tutorial.thj.interfaces.rodents.withabstract;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Interfaces
 * Section - Abstract classes and methods
 * Exercise 1
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

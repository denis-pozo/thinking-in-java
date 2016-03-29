package org.denispozo.tutorial.thj.interfaces.rodents.withabstract;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Interfaces
 * Section - Abstract classes and methods
 * Exercise 1
 */

public abstract class Rodent {

	public Rodent() {
		print("Rodent()");
	}

	public abstract void gnaw();
	
	public abstract void sniff();

}
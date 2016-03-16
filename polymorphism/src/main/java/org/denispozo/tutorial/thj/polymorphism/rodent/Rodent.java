package org.denispozo.tutorial.thj.polymorphism.rodent;

import static org.denispozo.tutorial.thj.util.Print.*;

import org.denispozo.tutorial.thj.polymorphism.Sandwich; 

/*
 * Chapter - Polymorphism
 * Section - Extensibility
 * Exercise 8
 */
public class Rodent {
	
	@SuppressWarnings("unused")
	private Sandwich sandwich = new Sandwich();
	
	public Rodent() {
		print("Rodent()");
	}

	public void gnaw() {
		print("Rodent.gnaw()");
	}
	
	public void sniff() {
		print("Rodent.sniff()");
	}
}
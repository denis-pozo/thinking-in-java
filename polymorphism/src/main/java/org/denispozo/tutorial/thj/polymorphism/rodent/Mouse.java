package org.denispozo.tutorial.thj.polymorphism.rodent;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import org.denispozo.tutorial.thj.polymorphism.Sandwich; 

/*
 * Chapter - Polymorphism
 * Section - Extensibility
 * Exercise 8
 */

public class Mouse extends Rodent{
	
	@SuppressWarnings("unused")
	private Sandwich sandwich = new Sandwich();
	
	public Mouse() {
		print("Mouse()");
	}
	
	public void gnaw() {
		print("Mouse.gnaw()");
	}
	
	public void sniff() {
		print("Mouse.sniff()");
	}
}

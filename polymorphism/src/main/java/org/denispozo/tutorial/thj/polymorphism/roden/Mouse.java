package org.denispozo.tutorial.thj.polymorphism.roden;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Polymorphism
 * Section - Extensibility
 * Exercise 8
 */

public class Mouse extends Rodent{
	
	public void gnaw() {
		print("Mouse.gnaw()");
	}
	
	public void sniff() {
		print("Mouse.sniff()");
	}
}

package org.denispozo.tutorial.thj.interfaces.rodents.withabstract;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Interfaces
 * Section - Abstract classes and methods
 * Exercise 1
 */

public class Mouse extends Rodent{
	
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

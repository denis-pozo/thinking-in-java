package org.denispozo.tutorial.thj.interfaces.rodents.withinterface;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Interfaces
 * Section - Interfaces
 * Exercise 7
 */

public class Mouse implements Rodent{
	
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

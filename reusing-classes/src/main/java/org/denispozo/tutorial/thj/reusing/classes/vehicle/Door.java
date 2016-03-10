package org.denispozo.tutorial.thj.reusing.classes.vehicle;

/*
 * Chapter - Reusing Classes
 * Section - Choosing composition vs. inheritance
 * Exercise 14
 */

class Door {
	
	public Window window = new Window();
	public void open() {};
	public void close() {};
}

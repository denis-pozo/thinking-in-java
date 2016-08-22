package org.denispozo.tutorial.thj.type.information.shapes;

/*
 * Chapter - Type Information
 * Section - The Class Object
 * Exercise 3
 */

class RhomboidEx3 extends Shape {
	
	@Override public String toString() { 
		return (isHighlighted() ? "H" : "Unh") + "ighlighted " + "Rhomboid";   
	}
}
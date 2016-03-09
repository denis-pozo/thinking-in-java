package org.denispozo.tutorial.thj.reusing.classes;

/*
 * Chapter - Reusing Classes
 * Section - Composition Syntax
 * Exercise 1
 */

public class SecondClass {
	
	public SimpleClass simpleClass;
	
	public String toString() {
		simpleClass = new SimpleClass();
		
		return simpleClass.toString();
	}
}

package org.denispozo.tutorial.thj.interfaces.classprocessor;

/*
 * Chapter - Interfaces
 * Section - Complete decoupling
 * Exercise 11
 */

public interface Processor {
	
	public String name();
	
	Object process(Object input);
	
}

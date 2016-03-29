package org.denispozo.tutorial.thj.interfaces.classprocessor;

/*
 * Chapter - Interfaces
 * Section - Complete decoupling
 * Exercise 11
 */

public class Downcase extends StringProcessor {
	
	public String process(Object input) {
		return ((String) input).toLowerCase();
	}
}

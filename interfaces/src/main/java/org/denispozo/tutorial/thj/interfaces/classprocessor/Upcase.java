package org.denispozo.tutorial.thj.interfaces.classprocessor;

/*
 * Chapter - Interfaces
 * Section - Complete decoupling
 * Exercise 11
 */

public class Upcase extends StringProcessor {
	
	public String process(Object input) {
		return ((String)input).toUpperCase(); // _Covariant_ return
	}	
	
}

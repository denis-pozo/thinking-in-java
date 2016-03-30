package org.denispozo.tutorial.thj.interfaces.classprocessor;

import java.util.Arrays;

/*
 * Chapter - Interfaces
 * Section - Complete decoupling
 * Exercise 11
 */

public class Splitter extends StringProcessor {
	
	public String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}

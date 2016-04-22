package org.denispozo.tutorial.thj.interfaces.classprocessor;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Interfaces
 * Section - Complete decoupling
 * Exercise 11
 */

public class Apply {
	
	public static void process(Processor p, Object input) {
		print("Using Processor " + p.name());
		print(p.process(input));
	}
	
	public static String s = "Disagreement with beliefs is by definition incorrect";
	
	public static void main(String [] args) {
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
		process(new Swapper(), s);
	}

}

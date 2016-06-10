package org.denispozo.tutorial.thj.holding.objects.ex03;

/*
 * Chapter - Holding your Objects
 * Section - Basic concepts
 * Exercise 3
 */

public interface Selector {
	
	boolean end();
	Object current();
	void next();
}

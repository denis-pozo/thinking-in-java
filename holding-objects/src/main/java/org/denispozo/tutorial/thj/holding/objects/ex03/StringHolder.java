package org.denispozo.tutorial.thj.holding.objects.ex03;

/*
 * Chapter - Holding your Objects
 * Section - Basic concepts
 * Exercise 3
 */

public class StringHolder {
	
	private String str;
	
	public StringHolder(String str) {
		this.str = str;
	}
	
	@Override
	public String toString() {
		return str;
	}
}

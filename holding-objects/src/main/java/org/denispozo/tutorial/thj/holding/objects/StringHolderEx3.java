package org.denispozo.tutorial.thj.holding.objects;

/*
 * Chapter - Holding your Objects
 * Section - Basic concepts
 * Exercise 3
 */

public class StringHolderEx3 {
	
	private String str;
	
	public StringHolderEx3(String str) {
		this.str = str;
	}
	
	@Override
	public String toString() {
		return str;
	}
}

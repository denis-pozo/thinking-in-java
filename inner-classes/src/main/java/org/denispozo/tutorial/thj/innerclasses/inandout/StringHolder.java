package org.denispozo.tutorial.thj.innerclasses.inandout;

//import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Inner Classes
 * Section - The link to the outer class
 * Exercise 2
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

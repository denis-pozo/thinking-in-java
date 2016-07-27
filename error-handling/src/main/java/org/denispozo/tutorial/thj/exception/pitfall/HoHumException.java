package org.denispozo.tutorial.thj.exception.pitfall;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Pitfall: the lost exception
 * Example
 */

public class HoHumException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public String toString() {
		return "A trivial exception";
	}
}

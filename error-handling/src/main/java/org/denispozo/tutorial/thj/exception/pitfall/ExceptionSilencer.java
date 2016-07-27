package org.denispozo.tutorial.thj.exception.pitfall;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Pitfall: the lost exception
 * Example
 */

public class ExceptionSilencer {

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		
		try{
			throw new RuntimeException();
		} finally {
			// Using 'return' inside the finally block 
			// will silence thrown exception
			return;
		}
	}
}

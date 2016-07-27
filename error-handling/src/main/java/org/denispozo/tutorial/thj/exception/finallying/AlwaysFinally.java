package org.denispozo.tutorial.thj.exception.finallying;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - What's finally for?
 * Example
 */

public class AlwaysFinally {

	public static void main(String[] args) {
		print("Entering first try block");
		
		try{
			print("Entering second try block");
			try {
				throw new FourException();
			} finally { 
				print("finally in 2nd try block");
			}
		} catch (FourException e4) {
			print("Caught FourException in 1st try block");
		} finally {
			print("Finally in 1st try block");
		}
	}
}
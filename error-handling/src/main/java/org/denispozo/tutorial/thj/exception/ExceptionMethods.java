package org.denispozo.tutorial.thj.exception;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Catching Any Exception
 * Example
 */

public class ExceptionMethods {

	public static void main(String[] args) {
		
		try {
			throw new Exception("My Exception");
		} catch (Exception e) {
			print("Caught Exception");
			print("getMessage(): " + e.getMessage());
			print("getLocalizedMessage(): " + e.getLocalizedMessage());
			print("toString(): " + e);
			print("printStackTrace(): ");
			e.printStackTrace(System.out);
		}
	}
}

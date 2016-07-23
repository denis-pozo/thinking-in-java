package org.denispozo.tutorial.thj.exception;

/*
 * Chapter - Error Handling with Exceptions
 * Section - The Exception Specification
 * Exercise 8
 */

public class ExceptionsEx8 {
	
	public static void throwIt() throws MyException{
		throw new MyException();
	}

	public static void main(String[] args) {
		try{
			throwIt();
		} catch (MyException me) {
			me.printStackTrace();
		}
	}
}

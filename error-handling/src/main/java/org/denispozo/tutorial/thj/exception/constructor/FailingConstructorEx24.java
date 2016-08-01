package org.denispozo.tutorial.thj.exception.constructor;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Constructors
 * Exercise 22
 */

public class FailingConstructorEx24 {
	
	Integer [] ia = new Integer[2];
	
	String s;
	
	public FailingConstructorEx24(String s) throws Exception {
		ia[0] = 0;
		ia[1] = 1;
		ia[2] = 2;
		this.s = s;
	}
	
	public static void main(String[] args) {
		
		try {
			@SuppressWarnings("unused")
			FailingConstructorEx24 fc = new FailingConstructorEx24("Hi");
		} catch (Exception e) {
			System.err.println("Caught Exception in main()");
			e.printStackTrace(System.err);
		}
	}


}

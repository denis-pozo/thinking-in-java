package org.denispozo.tutorial.thj.exception.chaining;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Exception Chaining
 * Exercise 10
 */

public class ExceptionsEx10 {

	static void f() throws TwoEx11Exception {
		
		try{
			g();
		} catch (OneEx11Exception e10e) {
			e10e.printStackTrace(System.out);
			throw new TwoEx11Exception("From f()");
		}
	}
	
	static void g() throws OneEx11Exception {
		throw new OneEx11Exception("From g()");
	}

	public static void main(String[] args) {
		
		try {
			f();
		} catch (TwoEx11Exception e) {
			e.printStackTrace(System.out);
		}
	}
}

class OneEx10Exception extends Exception {

	private static final long serialVersionUID = 1L;

	OneEx10Exception(String message) {
		super(message);
	}
}

class TwoEx10Exception extends Exception {

	private static final long serialVersionUID = 1L;

	TwoEx10Exception(String message) {
		super(message);
	}
}
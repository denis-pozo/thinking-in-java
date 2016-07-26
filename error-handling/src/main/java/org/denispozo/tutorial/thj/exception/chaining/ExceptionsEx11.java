package org.denispozo.tutorial.thj.exception.chaining;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Exception Chaining
 * Exercise 11
 */

public class ExceptionsEx11 {

	static void f() throws TwoEx11Exception {
		
		try{
			g();
		} catch (OneEx11Exception e11e) {
			throw new RuntimeException(e11e);
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

class OneEx11Exception extends Exception {

	private static final long serialVersionUID = 1L;

	OneEx11Exception(String message) {
		super(message);
	}
}

class TwoEx11Exception extends Exception {

	private static final long serialVersionUID = 1L;

	TwoEx11Exception(String message) {
		super(message);
	}
}
package org.denispozo.tutorial.thj.exception.rethrow;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Rethrowing an Exception
 * Example
 */

public class RethrowNew {

	public static void f() throws OneException {
		print("originating the exception in f()");
		throw new OneException("thrown from f()");
	}

	public static void main(String[] args) {
		try {
			try {
				f();
			} catch (OneException e) {
				print("Caught in inner try, e.printStackTrace()");
				e.printStackTrace(System.out);
				throw new TwoException("from inner try");
			}
		} catch (TwoException e) {
			print("Caught in outer try, e.printStackTrace()");
			e.printStackTrace(System.out);
		}
	}
}

class OneException extends Exception {

	private static final long serialVersionUID = 1L;

	public OneException(String s) {
		super(s);
	}
}

class TwoException extends Exception {

	private static final long serialVersionUID = 1L;

	public TwoException(String s) {
		super(s);
	}
}

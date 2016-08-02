package org.denispozo.tutorial.thj.exception.matching;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Exception Matching
 * Exercise 25
 */

public class ExceptionHierarchyEx25 {
	
	public static void main(String[] args) {
		A c = new C();
		
		try {
			c.eThrower();
		} catch (BaseException e) {
			print("Caught " + e);
			e.printStackTrace();
		}
	}
}

class A {
	public void eThrower() throws BaseException {
		throw new BaseException();
	}
}

class B extends A {
	public void eThrower() throws MiddleException {
		throw new MiddleException();
	}
}

class C extends B {
	public void eThrower() throws LastException {
		throw new LastException();
	}
}

class BaseException extends Exception {
	private static final long serialVersionUID = 1L;
}

class MiddleException extends BaseException {
	private static final long serialVersionUID = 1L;
}

class LastException extends MiddleException {
	private static final long serialVersionUID = 1L;
}


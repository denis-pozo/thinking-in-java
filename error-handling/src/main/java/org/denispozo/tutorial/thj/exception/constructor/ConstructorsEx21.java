package org.denispozo.tutorial.thj.exception.constructor;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Constructors
 * Example
 */

public class ConstructorsEx21 {

	public ConstructorsEx21 () {
		try{
			// Constructor call must be the first statement
			// super();
		} catch (Exception e) {
			print(e);
		}
	}
}

class Base {
	
	public Base() throws Exception {
		
	}
}
package org.denispozo.tutorial.thj.access.control.packages.accessors;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Access Control
 * Section - Java Access Specifiers
 * Exercise 6
 */

public class FirstClassWithProtectedData {
	
	protected String data = "Protected Data";
	
}

class SecondClass {
	
	public SecondClass() {
		FirstClassWithProtectedData object = new FirstClassWithProtectedData();
		print(object.data);
	}
	
}

package org.denispozo.tutorial.thj.access.control.packages.accessors;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Access Control
 * Section - Java Access Specifiers
 * Exercise 5
 */

@SuppressWarnings("unused")
public class AllAccessorsInOne {
	
	public String publicField = "Public Field";
	private String privateField = "Private Field";
	protected String protectedField = "Protected Field";
	
	public void publicMethod(){
		print("This is the public method");
	}

	private void privateMethod () {
		print("This is the private method");
	}
	
	protected void protectedMethod() {
		print("This is the protected method");
	}

			
			

}

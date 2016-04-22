package org.denispozo.tutorial.thj.innerclasses.upcasting;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Inner Classes
 * Section - Inner classes and Upcasting
 * Exercise 7 and 8
 */

public class PrivateOuter {
	
	private String name;
	
	private void sayHello() {
		print("PrivateOuter with name: "+ name + " > Hello");
	}
	
	public void callSetName(String n) {
		InnerOfPrivate inner = new InnerOfPrivate();
		inner.setOuterName(n);
		changeInnerName(inner); 
	}
	
	/* Exercise 8 - private fields of the inner class can be accessed from the outer class */
	private void changeInnerName(InnerOfPrivate inner) {
		inner.innerName = "CHANGED_INNER";
	}
	
	class InnerOfPrivate {
		
		@SuppressWarnings("unused")
		private String innerName = "INNER";
		
		public void setOuterName(String n) {
			name = n;
			sayHello();
		}
	}

	public static void main(String [] args) {
		PrivateOuter outer = new PrivateOuter();
		outer.callSetName("Filomena");
	}
}

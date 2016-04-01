package org.denispozo.tutorial.thj.innerclasses.inandout;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Inner Classes
 * Section - Creating inner classes
 * Exercise 1
 */

public class Outer {
	
	public Outer() {
		print("Outer()");
	}
	
	public Inner getInner() {
		return new Inner();
	}
	
	class Inner {
		public Inner() {
			print("Outer.Inner()");
		}
	}
	
	@SuppressWarnings("unused")
	public static void main(String [] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.getInner();		
	}
}

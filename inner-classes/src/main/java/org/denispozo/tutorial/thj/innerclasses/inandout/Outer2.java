package org.denispozo.tutorial.thj.innerclasses.inandout;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Inner Classes
 * Section - Creating inner classes
 * Exercise 3
 */

public class Outer2 {
	
	private String str;
	
	public Outer2(String str) {
		this.str = str;
	}
	
	public Inner getInner() {
		return new Inner();
	}
		
	class Inner {

		public String toString() {
			return str;
		}
	}
	
	public static void main(String [] args) {
		
		Outer2 outer = new Outer2("Hello World!");
		Outer2.Inner inner = outer.getInner();
		print(inner);
	}
}

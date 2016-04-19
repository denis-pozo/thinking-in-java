package org.denispozo.tutorial.thj.innerclasses.nested;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Inner Classes
 * Section - Classes inside interfaces
 * Exercise 20
 */

interface Interface {
	
	class Nested {
		
		Nested() {
			print("Nested()");
		}
		
		public void howdy(){
			print("Howdy!");
		}
	}
}

public class Implementation implements Interface {
	
	public static void main(String [] args) {
		Interface.Nested in = new Interface.Nested();
		in.howdy();
	}
	
}


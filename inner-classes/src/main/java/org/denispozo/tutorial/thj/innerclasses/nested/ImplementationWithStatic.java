package org.denispozo.tutorial.thj.innerclasses.nested;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Inner Classes
 * Section - Classes inside interfaces
 * Exercise 21
 */

public class ImplementationWithStatic implements In{
	public String f() {
		return "Hello";
	}
	
	public String g() {
		return "World";
	}

	public static void main(String [] args){
		ImplementationWithStatic x = new ImplementationWithStatic();
		In.Nested.testIn(x);
	}
}


interface In {
	
	String f();
	String g();
	class Nested {
		static void testIn(In interf){
			print(interf.f() + " " + interf.g());
		}
	}
}
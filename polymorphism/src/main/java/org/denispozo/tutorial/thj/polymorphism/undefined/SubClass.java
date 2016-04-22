package org.denispozo.tutorial.thj.polymorphism.undefined;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Polymorphism
 * Section - Extensibility
 * Exercise 10
 */

public class SubClass extends BaseClass{

	@Override
	public void method2() {
		print("Subclass.method2()");
	}
	
	public static void main(String [] args) {
		BaseClass object = new SubClass();
		// If object calls method1: first method1 from baseClass
		// will be called and then method2 of the subclass
		object.method1();
	}
}

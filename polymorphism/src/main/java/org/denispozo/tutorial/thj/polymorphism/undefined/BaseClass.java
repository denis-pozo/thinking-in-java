package org.denispozo.tutorial.thj.polymorphism.undefined;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Polymorphism
 * Section - Extensibility
 * Exercise 10
 */

public class BaseClass {

	public void method1 () {
		print("BaseClass.method1()");
		method2();
	}
	
	public void method2 () {
		print("BaseClass.method2()");
	}
}

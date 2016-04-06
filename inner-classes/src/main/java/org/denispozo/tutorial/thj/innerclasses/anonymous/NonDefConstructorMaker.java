package org.denispozo.tutorial.thj.innerclasses.anonymous;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Inner Classes
 * Section - Anonymous inner classes
 * Exercise 15
 */

public class NonDefConstructorMaker {

	public NonDefConstructor getNonDefConstructorClass(String n) {
		return new NonDefConstructor(n){ };
	}
	
	public static void main(String[] args) {
		NonDefConstructorMaker maker = new NonDefConstructorMaker();
		print("Michael " + maker.getNonDefConstructorClass("Jordan").getName());
	}
}

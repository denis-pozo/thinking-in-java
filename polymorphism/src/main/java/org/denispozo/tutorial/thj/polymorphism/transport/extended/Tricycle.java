package org.denispozo.tutorial.thj.polymorphism.transport.extended;

/*
 * Chapter - Polymorphism
 * Section - Substitution vs. Extension
 * Exercise 17
 */

public class Tricycle extends Cycle {
	
	@Override
	public int wheels() {
		return 3;
	}
	
	public static void main(String [] args) {
		Cycle tri = new Tricycle();
		tri.ride();
	}
}
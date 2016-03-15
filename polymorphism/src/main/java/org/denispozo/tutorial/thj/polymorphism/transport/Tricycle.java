package org.denispozo.tutorial.thj.polymorphism.transport;

/*
 * Chapter - Polymorphism
 * Section - Upcasting Revisited
 * Exercise 1 and 5
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
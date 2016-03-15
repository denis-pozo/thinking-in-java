package org.denispozo.tutorial.thj.polymorphism.transport;

/*
 * Chapter - Polymorphism
 * Section - Upcasting Revisited
 * Exercise 1 and 5
 */

public class Bicycle extends Cycle {
	
	@Override
	public int wheels() {
		return 2;
	}	
	
	public static void main(String [] args) {
		Cycle bi = new Bicycle();
		bi.ride();
	}
}
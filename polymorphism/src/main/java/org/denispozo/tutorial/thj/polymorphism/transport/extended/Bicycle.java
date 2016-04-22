package org.denispozo.tutorial.thj.polymorphism.transport.extended;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Polymorphism
 * Section - Substitution vs. Extension
 * Exercise 17
 */

public class Bicycle extends Cycle {
	
	@Override
	public int wheels() {
		return 2;
	}
	
	public void balance() {
		print("Bicycle.balance()");
	}
	
	public static void main(String [] args) {
		Cycle bi = new Bicycle();
		bi.ride();
	}
}
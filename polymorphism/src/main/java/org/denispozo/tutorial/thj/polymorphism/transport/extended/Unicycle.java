package org.denispozo.tutorial.thj.polymorphism.transport.extended;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Polymorphism
 * Section - Substitution vs. Extension
 * Exercise 17
 */

public class Unicycle extends Cycle {
	
	@Override
	public int wheels() {
		return 1;
	}
	
	public void balance() {
		print("Unicycle.balance()");
	}
	
	public static void main(String [] args) {
		Cycle uni = new Unicycle();
		uni.ride();
	}
}

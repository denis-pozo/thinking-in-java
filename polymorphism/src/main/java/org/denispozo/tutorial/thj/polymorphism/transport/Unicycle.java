package org.denispozo.tutorial.thj.polymorphism.transport;

/*
 * Chapter - Polymorphism
 * Section - Upcasting Revisited
 * Exercise 1 
 */

public class Unicycle extends Cycle {
	
	@Override
	public int wheels() {
		return 1;
	}	
	
	public static void main(String [] args) {
		Cycle uni = new Unicycle();
		uni.ride();
	}
}

package org.denispozo.tutorial.thj.interfaces.cycles;

import static org.denispozo.tutorial.thj.util.Print.print; 

/*
 * Chapter - Interfaces
 * Section - Interfaces and factories
 * Exercise 18
 */

public class Unicycle implements Cycle {
	
	private static final int NUM_WHEELS = 1;
	
	@Override
	public int wheels() {
		return NUM_WHEELS;
	}	
	
	@Override
	public void ride() {
		print("Unicycle.ride()");
		
	}
	
	public static void main(String [] args) {
		Cycle bi = new Unicycle();
		bi.ride();
	}
}

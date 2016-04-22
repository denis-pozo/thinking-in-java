package org.denispozo.tutorial.thj.interfaces.cycles;

import static org.denispozo.tutorial.thj.util.PrintUtil.print; 

/*
 * Chapter - Interfaces
 * Section - Interfaces and factories
 * Exercise 18
 */

public class Tricycle implements Cycle {
	
	private static final int NUM_WHEELS = 3;
	
	@Override
	public int wheels() {
		return NUM_WHEELS;
	}	
	
	@Override
	public void ride() {
		print("Tricycle.ride()");
		
	}
	
	public static void main(String [] args) {
		Cycle bi = new Tricycle();
		bi.ride();
	}
}
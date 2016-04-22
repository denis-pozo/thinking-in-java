package org.denispozo.tutorial.thj.interfaces.cycles;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Interfaces
 * Section - Interfaces and factories
 * Exercise 18
 */

public class Bicycle implements Cycle {
	
	private static final int NUM_WHEELS = 2;
	
	@Override
	public int wheels() {
		return NUM_WHEELS;
	}	
	
	@Override
	public void ride() {
		print("Bicycle.ride()");
		
	}
	
	public static void main(String [] args) {
		Cycle bi = new Bicycle();
		bi.ride();
	}
}
package org.denispozo.tutorial.thj.interfaces.filters;

/*
 * Chapter - Interfaces
 * Section - Complete decoupling
 * Exercise 11
 */

public class HighPass extends Filter {
	
	double cutoff;
	
	public HighPass(double cutoff) {
		this.cutoff = cutoff;
	}
	
	public Waveform process(Waveform input) {
		return input;
	}
}

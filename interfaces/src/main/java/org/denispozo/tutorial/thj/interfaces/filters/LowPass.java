package org.denispozo.tutorial.thj.interfaces.filters;

/*
 * Chapter - Interfaces
 * Section - Complete decoupling
 * Exercise 11
 */

public class LowPass extends Filter {
	
	double cutoff;
	
	public LowPass(double cutoff) {
		this.cutoff = cutoff;
	}
	
	public Waveform process(Waveform input) {
		return input; //Dummy processing
	}
}

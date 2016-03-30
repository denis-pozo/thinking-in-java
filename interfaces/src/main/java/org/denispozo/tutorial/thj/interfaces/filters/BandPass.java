package org.denispozo.tutorial.thj.interfaces.filters;

/*
 * Chapter - Interfaces
 * Section - Complete decoupling
 * Exercise 11
 */

public class BandPass extends Filter {
	
	double lowCutoff;
	double highCutoff;
	
	public BandPass(double lowCut, double highCut) {
		lowCutoff = lowCut;
		highCutoff = highCut;	
	}
	
	public Waveform process(Waveform input) {
		return input;
	}
}

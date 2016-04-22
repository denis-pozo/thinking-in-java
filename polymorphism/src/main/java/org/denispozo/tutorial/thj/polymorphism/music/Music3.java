package org.denispozo.tutorial.thj.polymorphism.music;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Polymorphism
 * Section - Extensibility
 * Exercise 6
 */

public class Music3 {
	/* Doesn't care about type, so new types added to the system
	 * still work right: */
	public static void tune(Instrument instrument) {
		print(instrument);
		instrument.play(Note.MIDDLE_C);
	}
	
	public static void tuneAll(Instrument[] instruments) {
		for(Instrument instrument : instruments) {
			tune(instrument);
		}
	}
	
	public static void main(String [] args) {
		/* Upcasting during addition to the array: */
		RandomInstrumentsGenerator gen = new RandomInstrumentsGenerator();
		Instrument [] orchestra = new Instrument[10];
		
		for(int i = 0 ; i < orchestra.length ; i ++) {
			orchestra[i] = gen.next();
		}
		
		tuneAll(orchestra);
	}
	

}

package org.denispozo.tutorial.thj.polymorphism.music;

import java.util.Random;

/*
 * Chapter - Polymorphism
 * Section - Extensibility
 * Exercise 8 
 */

public class RandomInstrumentsGenerator {

	private Random random = new Random(65);
	
	public Instrument next() {
		switch(random.nextInt(6)){
			default:
			case 0: return new Instrument();
			case 1: return new Wind();
			case 2: return new Percussion();
			case 3: return new Stringed();
			case 4: return new Woodwind();
			case 5: return new Brass();
			case 6: return new Piano();			
		}
	}
}

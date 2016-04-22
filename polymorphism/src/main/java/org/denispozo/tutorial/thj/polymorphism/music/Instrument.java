package org.denispozo.tutorial.thj.polymorphism.music;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Polymorphism
 * Section - Extensibility
 * Exercise 6
 */

public class Instrument {
	
	public void play(Note note){ 
		print("Instrument.play() " + note);
	}
	
	@Override
	public String toString() {
		return "Instrument";
	}
	
	public void adjust() {
		print("Adjusting Instrument");
	}

}

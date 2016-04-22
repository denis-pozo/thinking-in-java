package org.denispozo.tutorial.thj.polymorphism.music;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Polymorphism
 * Section - Extensibility
 * Exercise 6
 */

public class Wind extends Instrument {
	
	public void play(Note note){ 
		print("Wind.play() " + note);
	}
	
	@Override
	public String toString() {
		return "Wind";
	}
	
	public void adjust() {
		print("Adjusting Wind");
	}
}

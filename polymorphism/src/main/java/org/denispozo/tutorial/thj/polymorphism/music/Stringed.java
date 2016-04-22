package org.denispozo.tutorial.thj.polymorphism.music;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Polymorphism
 * Section - Extensibility
 * Exercise 6
 */

public class Stringed extends Instrument {
	
	public void play(Note note){ 
		print("Stringed.play() " + note);
	}
	
	@Override
	public String toString() {
		return "Stringed";
	}
	
	public void adjust() {
		print("Adjusting Stringed");
	}
}

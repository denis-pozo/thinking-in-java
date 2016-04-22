package org.denispozo.tutorial.thj.polymorphism.music;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Polymorphism
 * Section - Extensibility
 * Exercise 6
 */

public class Percussion extends Instrument {
	
	public void play(Note note){ 
		print("Percussion.play() " + note);
	}
	
	@Override
	public String toString() {
		return "Percussion";
	}
	
	public void adjust() {
		print("Adjusting Percussion");
	}
}

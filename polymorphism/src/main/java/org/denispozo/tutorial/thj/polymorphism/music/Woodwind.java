package org.denispozo.tutorial.thj.polymorphism.music;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Polymorphism
 * Section - Extensibility
 * Exercise 6
 */

public class Woodwind extends Wind {
	
	public void play(Note note){ 
		print("Woodwind.play() " + note);
	}
	
	@Override
	public String toString() {
		return "Woodwind";
	}
}

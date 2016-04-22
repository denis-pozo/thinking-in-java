package org.denispozo.tutorial.thj.polymorphism.music;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Polymorphism
 * Section - Extensibility
 * Exercise 6
 */

public class Brass extends Wind {
	
	public void play(Note note){ 
		print("Brass.play() " + note);
	}
	
	public void adjust() {
		print("Adjusting Brass");
	}
}
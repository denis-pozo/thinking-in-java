package org.denispozo.tutorial.thj.interfaces.music;

//import org.denispozo.tutorial.thj.polymorphism.music.Note;

/*
 * Chapter - Interfaces
 * Section - Interfaces
 * Exercise 9 and 10
 */

interface Instrument {
	// Compile-time constant:
	int VALUE = 5;  // static & final
	
	// Cannot have method definitions
	// void play(Note note);
	void adjust();
}

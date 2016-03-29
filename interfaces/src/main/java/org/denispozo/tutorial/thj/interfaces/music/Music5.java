package org.denispozo.tutorial.thj.interfaces.music;

import org.denispozo.tutorial.thj.polymorphism.music.Note;

/*
 * Chapter - Interfaces
 * Section - Interfaces
 * Exercise 9 and 10
 */

public class Music5 {
	
	// Doesn't care about type, so new types
	// added to the system still work right:
	static void tune(Playable playable) {
		playable.play(Note.MIDDLE_C);
	}

	static void tuneAll(Playable [] instruments) {
		for(Playable p : instruments) {
			tune(p);
		}
	}
	
	public static void main(String [] args) {
	// Upcasting during addition to the array:
		Playable [] orchestra = {
			new Wind(),
			new Percussion(),
			new Stringed(),
			new Brass(),
			new Woodwind()
		};
		
		tuneAll(orchestra);
	}
}

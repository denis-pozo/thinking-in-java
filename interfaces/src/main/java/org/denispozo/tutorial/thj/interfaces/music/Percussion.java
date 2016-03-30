package org.denispozo.tutorial.thj.interfaces.music;

import static org.denispozo.tutorial.thj.util.Print.print;

import org.denispozo.tutorial.thj.polymorphism.music.Note;

/*
 * Chapter - Interfaces
 * Section - Interfaces
 * Exercise 9 and 10
 */

class Percussion extends AbstractInstrument implements Playable {
	
	@Override
	public void play(Note note) {
		print(this + ".play() " + note);
		
	}
	
	public String toString() {
		return "Percussion";
	}
}

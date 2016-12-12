package org.denispozo.tutorial.thj.type.information.music;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;
import org.denispozo.tutorial.thj.polymorphism.music.Note;


/*
 * Chapter - Type Information
 * Section - Summary
 * Exercise 26
 */

public class Music {
	// Doesn't care about type, so new types
	// added to the system still work right:
	public static void tune(Instrument i) {
		//...
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
	}
	private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();	
	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument[] orchestra = new Instrument[20];
		// fill up orchestra array wth instruments:
		for(int i = 0; i < orchestra.length; i++)
			orchestra[i] = gen.next();
		for(Instrument i : orchestra) {
			if(i instanceof Wind) // get RTTI
				((Wind)i).clearSpitValve();
			i.adjust();
		}
		tuneAll(orchestra);
	}
}

class Instrument {
	void play(Note n) { print("Instrument.play() " + n); }
	public String toString() { return "Instrument"; }
	void adjust() { print("Adjusting Instrument"); }
}

class Wind extends Instrument {
	void play(Note n) { print("Wind.play() " + n); }
	public String toString() { return "Wind"; }
	void adjust() { print("Adjusting Wind"); }
	void clearSpitValve() { print("Wind clearing spit valve"); }
}

class Percussion extends Instrument {
	void play(Note n) { print("Percussion.play() " + n); }
	public String toString() { return "Percussion"; }
	void adjust() { print("Adjusting Percussion"); } 
}

class Stringed extends Instrument {
	void play(Note n) { print("Stringed.play() " + n); }
	public String toString() { return "Stringed"; }
	void adjust() { print("Adjusting Stringed"); } 
}

class Keyboard extends Instrument {
	void play(Note n) { print("Keyboard.play() " + n); }
	public String toString() { return "Keyboard"; }
	void adjust() { print("Adjusting Keyboard"); } 
}

class Brass extends Wind {
	void play(Note n) { print("Brass.play() " + n); }
	public String toString() { return "Brass"; }
	void adjust() { print("Adjusting Brass"); }
	void clearSpitValve() { print("Brass clearing spit valve"); }
}

class Woodwind extends Wind {
	void play(Note n) { print("Woodwind.play() " + n); }
	public String toString() { return "Woodwind"; }
	void clearSpitValve() { print("Woodwind clearing spit valve"); }
}

class Piano extends Keyboard {
	void play(Note n) { print("Piano.play() " + n); }
	public String toString() { return "Piano"; }
}


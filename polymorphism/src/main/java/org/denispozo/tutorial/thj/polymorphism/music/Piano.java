package org.denispozo.tutorial.thj.polymorphism.music;

import static org.denispozo.tutorial.thj.util.Print.print;

/*
 * Chapter - Polymorphism
 * Section - Extensibility
 * Exercise 7
 */

public class Piano extends Stringed {
	
	public void play(Note note){ 
		print("Piano.play() " + note);
	}
	
	@Override
	public String toString() {
		return "Piano";
	}
	
	public void adjust() {
		print("Adjusting Piano");
	}

}

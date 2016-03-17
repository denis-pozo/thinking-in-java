package org.denispozo.tutorial.thj.polymorphism.polyconstructors;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Polymorphism
 * Section - Behavior of polymporphic methods inside constructors
 * Exercise 15
 */

public class Glyph {
	
	public Glyph() {
		print("Glyph() before draw()");
		draw();
		print("Glyph() after draw()");
	}
	
	void draw() { 
		print("Glyph.draw()");
	}
}

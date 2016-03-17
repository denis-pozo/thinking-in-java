package org.denispozo.tutorial.thj.polymorphism.polyconstructors;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Polymorphism
 * Section - Behavior of polymporphic methods inside constructors
 * Exercise 15
 */

public class RoundGlyph extends Glyph {
	
	private int radius = 1;
	
	public RoundGlyph(int r) {
		radius = r;
		print("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	
	void draw() { 
		print("RoundGlyph.draw(), radius = " + radius);
	}
}

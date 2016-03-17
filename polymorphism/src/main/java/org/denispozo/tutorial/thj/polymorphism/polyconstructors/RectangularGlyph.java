package org.denispozo.tutorial.thj.polymorphism.polyconstructors;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Polymorphism
 * Section - Behavior of polymporphic methods inside constructors
 * Exercise 15
 */

public class RectangularGlyph extends Glyph {
	
	private int width = 1;
	private int height = 12;
	
	public RectangularGlyph(int w, int h) {
		this.width = w;
		this.height = h;
		
		print("RectangularGlyph.RectangularGlyph(), width = " + width + ", height = " + height);
	}
	
	void draw() { 
		print("RectangularGlyph.draw(), width = " + width + ", height = " + height);
	}
}

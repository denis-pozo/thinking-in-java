package org.denispozo.tutorial.thj.polymorphism.shape;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Polymorphism
 * Section - Producing the Right Behavior
 * Exercise 2, 3 and 4
 */

public class Triangle extends Shape {
	
	@Override
	public void draw() {
		print("Triangle.draw()");
	}
	
	@Override
	public void erase() {
		print("Triangle.erase()");
	}
	
	@Override
	public void who() {
		print("I am a Shape.Triangle");
	}

}
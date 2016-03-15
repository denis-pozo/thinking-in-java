package org.denispozo.tutorial.thj.polymorphism.shape;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Polymorphism
 * Section - Producing the Right Behavior
 * Exercise 2, 3 and 4 
 */

public class Square extends Shape{
	
	@Override
	public void draw() {
		print("Square.draw()");
	}
	
	@Override
	public void erase() {
		print("Square.erase()");
	}
	
	@Override
	public void who() {
		print("I am a Shape.Square");
	}
}
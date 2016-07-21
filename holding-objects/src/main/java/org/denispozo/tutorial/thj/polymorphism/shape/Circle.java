package org.denispozo.tutorial.thj.polymorphism.shape;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Polymorphism
 * Section - Producing the Right Behavior
 * Exercise 2, 3 and 4
 */

public class Circle extends Shape {
	
	@Override
	public void draw() {
		print("Circle.draw()");
	}
	
	@Override
	public void erase() {
		print("Circle.erase()");
	}
	
	@Override
	public void who() {
		print("I am a Shape.Circle");
	}

}

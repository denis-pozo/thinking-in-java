package org.denispozo.tutorial.thj.polymorphism.shape;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Polymorphism
 * Section - Producing the Right Behavior
 * Exercise 2 
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

}

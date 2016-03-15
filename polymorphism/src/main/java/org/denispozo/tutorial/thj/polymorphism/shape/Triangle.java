package org.denispozo.tutorial.thj.polymorphism.shape;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Polymorphism
 * Section - Producing the Right Behavior
 * Exercise 2 
 */

public class Triangle extends Shape {
	
	public void draw() {
		print("Triangle.draw()");
	}
	
	public void erase() {
		print("Triangle.erase()");
	}

}
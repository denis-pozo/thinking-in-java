package org.denispozo.tutorial.thj.polymorphism.shape;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Polymorphism
 * Section - Producing the Right Behavior
 * Exercise 2 
 */

public class Square extends Shape{
	
	public void draw() {
		print("Square.draw()");
	}
	
	public void erase() {
		print("Square.erase()");
	}

}
package org.denispozo.tutorial.thj.polymorphism.shape;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Polymorphism
 * Section - Producing the Right Behavior
 * Exercise 2, 3 and 4 
 */

public class Shapes {
	
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	
	public static void main(String [] args) {
		Shape [] shapes = new Shape[99];
		
		for(int i = 0 ; i < shapes.length ; i++) {
			shapes[i] = gen.next();
		}
		print("+++ Drawing +++");
		for(Shape shape : shapes) {
			shape.draw();
		}
		print("+++ Who is there +++");
		for(Shape shape : shapes) {
			shape.who();
		}
	}
}

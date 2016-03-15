package org.denispozo.tutorial.thj.polymorphism.shape;

import java.util.Random;

/*
 * Chapter - Polymorphism
 * Section - Producing the Right Behavior
 * Exercise 2, 3 and 4 
 */

public class RandomShapeGenerator {
		
	private Random random = new Random(47);
	
	public Shape next() {
		switch(random.nextInt(4)) {
			default:
			case 0: return new Circle();
			case 1: return new Triangle();
			case 2: return new Square();
			case 3: return new Rhombus();
		}
	}
}

package org.denispozo.tutorial.thj.polymorphism.shape;

import java.util.Random;

/*
 * Chapter - Polymorphism
 * Section - Producing the Right Behavior
 * Exercise 2 
 */

public class RandomShapeGenerator {
		
	private Random random = new Random(100);
	
	public Shape next() {
		switch(random.nextInt(3)) {
			default:
			case 0: return new Circle();
			case 1: return new Triangle();
			case 3: return new Square();
		}
	}
}

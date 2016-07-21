package org.denispozo.tutorial.thj.holding.objects.iterable;

import java.util.Iterator;
import java.util.Random;

import org.denispozo.tutorial.thj.polymorphism.shape.Circle;
import org.denispozo.tutorial.thj.polymorphism.shape.Rhombus;
import org.denispozo.tutorial.thj.polymorphism.shape.Shape;
import org.denispozo.tutorial.thj.polymorphism.shape.Square;
import org.denispozo.tutorial.thj.polymorphism.shape.Triangle;

/*
 * Chapter - Holding your objects
 * Section - For each and iterators
 * Exercise 31
 */

public class RandomShapeGeneratorEx31 implements Iterable<Shape> {
		
	private Random random = new Random(47);
	
	private int numShapes;
	
	public RandomShapeGeneratorEx31(int numShapes){
		this.numShapes = numShapes;
	}
	
	@Override
	public Iterator<Shape> iterator() {
		return new Iterator<Shape>() {
			private int index = 0;
			public boolean hasNext() {
				return index < numShapes;
			}
			public Shape next() {
				switch(random.nextInt(4)) {
					default:
					case 0: index++; return new Circle();
					case 1: index++; return new Triangle();
					case 2: index++; return new Square();
					case 3: index++; return new Rhombus();
				}
			}
			public void remove() { // not implemented
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public static void main(String[] args) {

		for(Shape shape : new RandomShapeGeneratorEx31(10)){
			shape.draw();
		}
	}
}

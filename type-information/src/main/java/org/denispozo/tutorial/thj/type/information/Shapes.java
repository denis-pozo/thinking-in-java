package org.denispozo.tutorial.thj.type.information;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.Arrays;
import java.util.List;

/*
 * Chapter - Type Information
 * Section - The need for Runtime Type Information (RTTI)
 * Example
 */

public class Shapes {
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
		
		for(Shape shape : shapeList){
			shape.draw();
		}
	}
	
}

abstract class Shape {
	void draw() { print(this + ".draw()"); }
	abstract public String toString();
}

class Circle extends Shape {
	@Override public String toString() { return "Circle"; } 
}

class Square extends Shape {
	@Override public String toString() { return "Square"; } 
}

class Triangle extends Shape {
	@Override public String toString() { return "Triangle"; } 
}
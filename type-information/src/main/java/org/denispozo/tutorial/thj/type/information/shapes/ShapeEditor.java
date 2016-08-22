package org.denispozo.tutorial.thj.type.information.shapes;

import java.util.Arrays;
import java.util.List;

/*
 * Chapter - Type Information
 * Section - The need for Runtime Type Information (RTTI)
 * Example
 */

public class ShapeEditor {
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
		
		for(Shape shape : shapeList){
			shape.draw();
		}
	}
	
}


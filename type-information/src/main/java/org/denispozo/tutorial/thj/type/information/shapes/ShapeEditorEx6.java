package org.denispozo.tutorial.thj.type.information.shapes;

import java.util.Arrays;
import java.util.List;

/*
 * Chapter - Type Information
 * Section - The Class Object
 * Exercise 6
 */

public class ShapeEditorEx6 {
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new RhomboidEx3());
		highlightAll(shapeList, Circle.class);
		drawAll(shapeList);
	}
	
	static void highlightAll(List<Shape> shapes, @SuppressWarnings("rawtypes") Class type){
		for(Shape shape : shapes){
			if(shape.getClass().equals(type)){
				shape.highlight();
			}
		}
	}
	
	static void drawAll(List<Shape> shapes){
		for(Shape shape : shapes){
			shape.draw();
		}
	}
	
//	static void rotateAll(List<Shape> shapes){
//		for(Shape shape : shapes){
//				rotate(shape);
//		}
//	}
//	
//	static void rotate(Shape shape){
//		if(!(shape instanceof Circle)){
//			print("rotate(" + shape + ")");
//		}
//	}
	
}


package org.denispozo.tutorial.thj.type.information.shapes;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.Arrays;
import java.util.List;

/*
 * Chapter - Type Information
 * Section - The Class Object
 * Exercise 5
 */

public class ShapeEditorEx5 {
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new RhomboidEx3());
		
		drawAll(shapeList);
		rotateAll(shapeList);
	}
	 
	static void drawAll(List<Shape> shapes){
		for(Shape shape : shapes){
			shape.draw();
		}
	}
	
	static void rotateAll(List<Shape> shapes){
		for(Shape shape : shapes){
				rotate(shape);
		}
	}
	
	static void rotate(Shape shape){
		if(!(shape instanceof Circle)){
			print("rotate(" + shape + ")");
		}
	}
	
}


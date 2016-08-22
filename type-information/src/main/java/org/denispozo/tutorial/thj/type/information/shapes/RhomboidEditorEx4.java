package org.denispozo.tutorial.thj.type.information.shapes;

/*
 * Chapter - Type Information
 * Section - The Class Object
 * Exercise 4
 */

public class RhomboidEditorEx4 {
	public static void main(String[] args) {
		Shape shape = new RhomboidEx3();
		RhomboidEx3 rhomboid;
		Circle circle;
		if(shape instanceof RhomboidEx3){
			rhomboid = (RhomboidEx3) shape;
			rhomboid.draw();
		} else if(shape instanceof Circle) {
			circle = (Circle) shape;
			circle.draw();
		}
	}
}


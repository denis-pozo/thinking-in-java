package org.denispozo.tutorial.thj.type.information.shapes;

/*
 * Chapter - Type Information
 * Section - The Class Object
 * Exercise 3
 */

public class RhomboidEditorEx3 {
	public static void main(String[] args) {
		Shape shape = new RhomboidEx3();
		RhomboidEx3 rhomboid = (RhomboidEx3) shape;
		rhomboid.draw();
		/*
		 * When downcasting to circle:
		 * Exception in thread "main" java.lang.ClassCastException: 
		 * org.denispozo.tutorial.thj.type.information.shapes.RhomboidEx3 
		 * cannot be cast to org.denispozo.tutorial.thj.type.information.shapes.Circle
		 */
		Circle circle = (Circle) shape;
		circle.draw();
	}
	
}


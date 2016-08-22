package org.denispozo.tutorial.thj.type.information.shapes;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Type Information
 * Section - The need for Runtime Type Information (RTTI)
 * Example
 */

public abstract class Shape {
	boolean highlighted = false;
	
	void highlight(){
		highlighted = true;
	}
	
	void unhighlight(){
		highlighted = false;
	}
	
	boolean isHighlighted(){
		return highlighted;
	}
	
	void draw() { print(this + ".draw()"); }
	abstract public String toString();
	
}

class Circle extends Shape {
	@Override public String toString() { 
		return (isHighlighted() ? "H" : "Unh") + "ighlighted " + "Circle";  
	}
}

class Square extends Shape {
	@Override public String toString() { 
		return (isHighlighted() ? "H" : "Unh") + "ighlighted " + "Square";  
	} 
}

class Triangle extends Shape {
	@Override public String toString() { 
		return (isHighlighted() ? "H" : "Unh") + "ighlighted " + "Triangle";  
	} 
}
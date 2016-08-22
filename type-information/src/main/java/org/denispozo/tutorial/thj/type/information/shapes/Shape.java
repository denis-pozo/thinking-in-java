package org.denispozo.tutorial.thj.type.information.shapes;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Type Information
 * Section - The need for Runtime Type Information (RTTI)
 * Example
 */

public abstract class Shape {
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
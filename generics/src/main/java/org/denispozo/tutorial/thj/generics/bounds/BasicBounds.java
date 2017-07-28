package org.denispozo.tutorial.thj.generics.bounds;

import java.awt.Color;

/*
 * Chapter - Generics
 * Section - Bounds
 * Example
 */

public class BasicBounds<T> {
	public static void main(String[] args) {
		Solid<Bounded> solid = new Solid<Bounded>(new Bounded());
		solid.color();
		solid.getY();
		solid.weight();
	}
}

interface HasColor { java.awt.Color getColor(); }

class Colored<T extends HasColor> {
	T item;
	Colored(T item) { 
		this.item = item; 
	}
	
	T getItem() {
		return item;
	}
	
	Color color() {
		return item.getColor();
	}
}

class Dimension {
	public int x, y, z;
}

// This wont work -- class must be first, then interfaces:
//class ColoredDimension<T extends HasColor & Dimension> {
class ColoredDimension<T extends Dimension & HasColor> {
	T item;
	
	ColoredDimension(T item) {
		this.item = item;
	}
	
	T getItem() {
		return item;
	}
	
	Color color() {
		return item.getColor();
	}
	
	int getX() {
		return item.x;
	}
	
	int getY() {
		return item.y;
	}
	
	int getZ() {
		return item.z;
	}
}

interface Weight {
	int weight();
}

class Solid<T extends Dimension & HasColor & Weight> {
	T item;
	
	Solid(T item) {
		this.item = item;
	}
	
	T getItem() {
		return item;
	}
	
	Color color() {
		return item.getColor();
	}

	int getX() {
		return item.x;
	}
	
	int getY() {
		return item.y;
	}
	
	int getZ() {
		return item.z;
	}
	
	int weight() {
		return item.weight();
	}
}

class Bounded extends Dimension implements HasColor, Weight {

	@Override
	public int weight() {
		return 0;
	}

	@Override
	public Color getColor() {
		return null;
	}
	
}
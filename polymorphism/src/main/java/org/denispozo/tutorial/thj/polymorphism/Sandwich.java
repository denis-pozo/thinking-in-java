package org.denispozo.tutorial.thj.polymorphism;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Polymorphism
 * Section - Constructors and Polymorphism
 * Exercise 11
 */

@SuppressWarnings("unused")
public class Sandwich extends PortableLunch {

	private Bread bread = new Bread();
	private Cheese cheese = new Cheese();
	private Lettuce lettuce = new Lettuce();
	private Pickle pickle = new Pickle();
	
	public Sandwich() {
		print("Sandwich()");
	}
	
	public static void main(String [] args) {
		new Sandwich();
	}
}

class Meal {
	Meal(){
		print("Meal()");
	}
}

class Lunch extends Meal {
	Lunch () {
		print("Lunch()");
	}
}

class PortableLunch extends Lunch {
	PortableLunch() {
		print("PortableLunch()");
	}
}

class Bread {
	Bread() {
		print("Bread()");
	}
}

class Cheese {
	Cheese() {
		print("Cheese()");
	}
}

class Lettuce {
	Lettuce() {
		print("Lettuce()");
	}
}

class Pickle {
	Pickle() {
		print("Pickle()");
	}
}


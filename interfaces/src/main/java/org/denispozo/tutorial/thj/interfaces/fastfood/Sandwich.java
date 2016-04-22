package org.denispozo.tutorial.thj.interfaces.fastfood;

import static org.denispozo.tutorial.thj.util.PrintUtil.*; 

/*
 * Chapter - Interfaces
 * Section - Interfaces
 * Exercise 8
 */

@SuppressWarnings("unused")
public class Sandwich extends PortableLunch implements FastFood{

	private Bread bread = new Bread();
	private Cheese cheese = new Cheese();
	private Lettuce lettuce = new Lettuce();
	private Pickle pickle = new Pickle();
	
	public Sandwich() {
		print("Sandwich()");
	}
	
	@Override
	public void printPreparationTime() {
		print("This is hyper-fast food, it just took 5 ns");
	}
	
	public static void main(String [] args) {
		Sandwich sandwich = new Sandwich();
		sandwich.printPreparationTime();
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

interface FastFood {

	void printPreparationTime();
}

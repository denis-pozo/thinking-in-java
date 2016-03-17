package org.denispozo.tutorial.thj.polymorphism.ships;

/*
 * Chapter - Polymorphism
 * Section - Designing with Inheritance
 * Exercise 16
 */

public class Space {

	public static void main(String [] args) {
		Starship starship = new Starship();
		starship.activateAlert();
		starship.change(new EnemiesAlert());
		starship.activateAlert();
		starship.change(new UnknownObjectsAlert());
		starship.activateAlert();
	}
}

package org.denispozo.tutorial.thj.polymorphism.ships;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Polymorphism
 * Section - Designing with Inheritance
 * Exercise 16
 */

public class UnknownObjectsAlert extends AlertStatus {

	@Override
	public void activate(){
		print("Attention: Unknwon Objects passing around");
	}

}

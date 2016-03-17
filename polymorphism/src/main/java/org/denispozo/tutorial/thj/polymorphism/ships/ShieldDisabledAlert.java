package org.denispozo.tutorial.thj.polymorphism.ships;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Polymorphism
 * Section - Behavior of polymporphic methods inside constructors
 * Exercise 16
 */

public class ShieldDisabledAlert extends AlertStatus {
	
	@Override
	public void activate(){
		print("Attention: Shield is disabled");
	}
}

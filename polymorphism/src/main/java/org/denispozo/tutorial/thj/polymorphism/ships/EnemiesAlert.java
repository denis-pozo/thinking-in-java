package org.denispozo.tutorial.thj.polymorphism.ships;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Polymorphism
 * Section - Designing with Inheritance
 * Exercise 16
 */

public class EnemiesAlert extends AlertStatus {

	@Override
	public void activate(){
		print("Attention: Enemies approaching");
	}

}

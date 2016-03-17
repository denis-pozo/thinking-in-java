package org.denispozo.tutorial.thj.polymorphism.ships;

/*
 * Chapter - Polymorphism
 * Section - Designing with Inheritance
 * Exercise 16
 */

public class Starship {
	
	AlertStatus alertStatus = new ShieldDisabledAlert();
	
	public void change(AlertStatus status) {
		alertStatus = status;
	}
	
	public void activateAlert() {
		alertStatus.activate();
	}
}

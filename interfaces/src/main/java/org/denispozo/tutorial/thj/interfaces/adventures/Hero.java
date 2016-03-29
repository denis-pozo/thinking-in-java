package org.denispozo.tutorial.thj.interfaces.adventures;

/*
 * Chapter - Interfaces
 * Section - Multiple inheritance in Java
 * Exercise 12
 */

public class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {
	
	public void fly() { }
	
	public void climb() { }
	
	public void swim() { }

}

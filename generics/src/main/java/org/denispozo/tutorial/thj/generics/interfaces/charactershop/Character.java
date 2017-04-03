package org.denispozo.tutorial.thj.generics.interfaces.charactershop;

/*
 * Chapter - Generics
 * Section - Generic interfaces
 * Exercise 8
 */
public class Character {

	private static long counter = 0;
	private final long id = counter++;
	
	public String toString(){
		return getClass().getSimpleName() + " " + id;
	}
}

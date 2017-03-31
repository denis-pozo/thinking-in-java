package org.denispozo.tutorial.thj.generics.interfaces;

/*
 * Chapter - Generics
 * Section - Generic interfaces
 * Example
 */
public class Coffee {

	private static long counter = 0;
	private final long id = counter++;
	
	public String toString(){
		return getClass().getSimpleName() + " " + id;
	}
}

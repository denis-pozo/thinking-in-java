package org.denispozo.tutorial.thj.interfaces.filters;

/*
 * Chapter - Interfaces
 * Section - Complete decoupling
 * Exercise 11
 */

public class Waveform {

	private static long counter;
	private final long id = counter++;

	public String toString() {
		return "Waveform " + id;
	}
}

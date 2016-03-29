package org.denispozo.tutorial.thj.interfaces.scanner;

import java.util.Random;

/*
 * Chapter - Interfaces
 * Section - Adapting to an interface
 * Exercise 16
 */

public class RandomChars {
	
	private static Random rand = new Random();
	
	public char next() {
		return (char) rand.nextInt(128);
	}
	
	public static void main(String [] args) {
		RandomChars crs = new RandomChars();
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print(crs.next() + " ");
		}
	}
}

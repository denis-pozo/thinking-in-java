package org.denispozo.tutorial.thj.interfaces.game;

import java.util.Random; 

/*
 * Chapter - Interfaces
 * Section - Interfaces and factories
 * Exercise 19
 */

public class CoinsGame implements TossingGame {
	
	private static final int NUM_RESULT_COMBINATIONS = 2;
	
	private static final Random rand = new Random();
	
	@Override
	public int toss() {
		return rand.nextInt(NUM_RESULT_COMBINATIONS);
	}
}
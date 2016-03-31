package org.denispozo.tutorial.thj.interfaces.game;

import java.util.Random; 

/*
 * Chapter - Interfaces
 * Section - Interfaces and factories
 * Exercise 19
 */

public class DicesGame implements TossingGame {
	
	private static final int NUM_RESULT_COMBINATIONS = 6;
	
	private static final Random rand = new Random();
	
	@Override
	public int toss() {
		return rand.nextInt(NUM_RESULT_COMBINATIONS);
	}
}
package org.denispozo.tutorial.thj.interfaces.game;

/*
 * Chapter - Interfaces
 * Section - Interfaces and factories
 * Exercise 19
 */

public class CoinsGameFactory implements TossingGameFactory {
	
	@Override
	public TossingGame getGame() {
		return new CoinsGame();
	}
}
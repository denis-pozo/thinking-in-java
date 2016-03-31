package org.denispozo.tutorial.thj.interfaces.game;

/*
 * Chapter - Interfaces
 * Section - Interfaces and factories
 * Exercise 19
 */

public class DicesGameFactory implements TossingGameFactory {

	@Override
	public TossingGame getGame() {
		return new DicesGame();
	}
	
}
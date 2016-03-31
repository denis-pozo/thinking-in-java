package org.denispozo.tutorial.thj.interfaces.game;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Interfaces
 * Section - Interfaces and factories
 * Exercise 19
 */

public class GamesShop {
	
	public static TossingGame play(TossingGameFactory factory){ 
		return factory.getGame();
	}
	
	public static void main (String [] args ) {
		TossingGame coins = play(new CoinsGameFactory());
		print("Tossing the coin - " + ((coins.toss() == 0) ? "fronts" : "tails"));
		TossingGame dices = play(new DicesGameFactory());
		print("Tossing the dice - " + (dices.toss() + 1));
	}

}

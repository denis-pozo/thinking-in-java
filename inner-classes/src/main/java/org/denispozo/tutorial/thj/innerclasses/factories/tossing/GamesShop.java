package org.denispozo.tutorial.thj.innerclasses.factories.tossing;

import static org.denispozo.tutorial.thj.util.Print.*;

import java.util.Random;

/*
 * Chapter - Inner Classes
 * Section - Factory Method Revisited
 * Exercise 17
 */

public class GamesShop {
	
	public static TossingGame play(TossingGameFactory factory){ 
		return factory.getGame();
	}
	
	public static void main (String [] args ) {
		TossingGame game = play(Dice.factory);
		print("Tossing the dice: " + game.toss());
		print("Tossing the dice: " + game.toss());
		print("Tossing the dice: " + game.toss());
		print("Tossing the dice: " + game.toss());
		print("Tossing the dice: " + game.toss());
		game = play(Coin.factory);
		print("Tossing the coin - " + ((game.toss() == 0) ? "fronts" : "tails"));
		print("Tossing the coin - " + ((game.toss() == 0) ? "fronts" : "tails"));
		print("Tossing the coin - " + ((game.toss() == 0) ? "fronts" : "tails"));
		print("Tossing the coin - " + ((game.toss() == 0) ? "fronts" : "tails"));
		print("Tossing the coin - " + ((game.toss() == 0) ? "fronts" : "tails"));
		print("Tossing the coin - " + ((game.toss() == 0) ? "fronts" : "tails"));
	}
}

interface TossingGame {
	int toss();
}

interface TossingGameFactory {
	TossingGame getGame();
}

class Dice implements TossingGame {
	
	private static final int NUM_RESULT_COMBINATIONS = 6;
	
	private static final Random rand = new Random();
	
	@Override
	public int toss() {
		return rand.nextInt(NUM_RESULT_COMBINATIONS) + 1;
	}
	
	public static TossingGameFactory factory = new TossingGameFactory() {
		public TossingGame getGame() {
			return new Dice();
		}
	};
}

class Coin implements TossingGame {

	private static final int NUM_RESULT_COMBINATIONS = 2;
	
	private static final Random rand = new Random();
	
	private Coin () { }
	
	@Override
	public int toss() {
		return rand.nextInt(NUM_RESULT_COMBINATIONS);
	}
	
	public static TossingGameFactory factory = new TossingGameFactory() {
		public TossingGame getGame() {
			return new Coin();
		}
	};
}

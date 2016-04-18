package org.denispozo.tutorial.thj.innerclasses.factories;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Inner Classes
 * Section - Factory Method Revisited
 * No Exercise
 */

public class Games {
	
	public static void playGame(GameFactory fact){
		Game game = fact.getGame();
		while(game.move());
	}
	
	public static void main(String [] args){
		playGame(Chess.factory);
		playGame(Checkers.factory);
	}
}

interface Game {
	boolean move();		
}

interface GameFactory {
	Game getGame();
}

class Chess implements Game {
	
	private int moves = 0;
	private static final int MOVES = 4;
	
	private Chess() {}
		
	@Override
	public boolean move() {
		print("Chess move " + moves);
		return ++moves != MOVES;
	}
	
	public static GameFactory factory = new GameFactory() {
		public Game getGame() { return new Chess(); }
	};
}

class Checkers implements Game {
	
	private int moves = 0;
	private static final int MOVES = 3;
	
	private Checkers() {}
		
	@Override
	public boolean move() {
		print("Checkers move " + moves);
		return ++moves != MOVES;
	}
	
	public static GameFactory factory = new GameFactory() {
		public Game getGame() { return new Checkers(); }
	};
}
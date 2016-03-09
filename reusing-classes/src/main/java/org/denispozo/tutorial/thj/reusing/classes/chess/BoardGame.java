package org.denispozo.tutorial.thj.reusing.classes.chess;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Reusing Classes
 * Section - Initializing the base class
 * Exercise 6
 */

class BoardGame extends Game {

	BoardGame(int i) {
		super(i);
		print("BoardGame constructor");
	}

}

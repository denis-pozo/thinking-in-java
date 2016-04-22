package org.denispozo.tutorial.thj.reusing.classes.chess;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Reusing Classes
 * Section - Initializing the base class
 * Exercise 6
 */

public class Chess extends BoardGame {

	Chess() {
		super(11);
		print("Chess constructor");
	}
	
	@SuppressWarnings("unused")
	public static void main(String [] args){
		Chess chess = new Chess();
		print("Proved how to call constructor with arguments of the base class");
	}

}

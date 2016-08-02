package org.denispozo.tutorial.thj.exception.matching;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Exception Matching
 * Example
 */

public class Human {
	
	@SuppressWarnings("hiding")
	public static void main(String[] args) {
		// Catch the exact type
		try {
			throw new Sneeze();
		} catch (Sneeze s) {
			print("Caught Sneeze");
		} catch (Annoyance a) {
			print("Caught Annoyance");
		}
		
		// Catch the base type
		try {
			throw new Sneeze();
		} catch (Annoyance a) {
			print("Caught Annoyance");
		}
	}
}

class Annoyance extends Exception {
	private static final long serialVersionUID = 1L;
}

class Sneeze extends Annoyance {
	private static final long serialVersionUID = 1L;
}


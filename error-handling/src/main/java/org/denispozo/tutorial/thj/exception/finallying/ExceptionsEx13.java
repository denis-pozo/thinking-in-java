package org.denispozo.tutorial.thj.exception.finallying;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.Random;

/*
 * Chapter - Error Handling with Exceptions
 * Section - What's finally for?
 * Exercise 13
 */

public class ExceptionsEx13 {
	
	public static void throwRandomException() throws NullPointerException, ArrayIndexOutOfBoundsException, Exception {
		Random rand = new Random(54);
		int randInt = rand.nextInt(3);

		switch (randInt) {
		case 0:
			throw new Exception();
		case 1:
			throw new NullPointerException();
		case 2:
			throw new ArrayIndexOutOfBoundsException();
		default:
			break;
		}
	}

	public static void main(String[] args) {

		try {
			throwRandomException();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			print("Finally Block");
		}
	}
}
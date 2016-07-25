package org.denispozo.tutorial.thj.exception;

import java.util.Random;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Catching Any Exception
 * Exercise 9
 */

public class ExceptionsEx9 {
	
	public static void throwRandomException() throws Exception1, Exception2, Exception3 {
			Random rand = new Random(54);
			int randInt = rand.nextInt(3);
			
			switch(randInt){
				case 0: throw new Exception1();
				case 1: throw new Exception2();
				case 2: throw new Exception3();
				default: break;
			}
		
		
	}

	public static void main(String[] args) {
		try{
			throwRandomException();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Exception1 extends Exception {

	private static final long serialVersionUID = 1L;
	
}

class Exception2 extends Exception {

	private static final long serialVersionUID = 1L;
	
}

class Exception3 extends Exception {

	private static final long serialVersionUID = 1L;
	
}

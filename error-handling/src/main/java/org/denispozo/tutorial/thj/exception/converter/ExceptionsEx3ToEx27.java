package org.denispozo.tutorial.thj.exception.converter;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Passing exceptions to the console
 * Exercise 27
 */

public class ExceptionsEx3ToEx27 {
	
	public static void main(String[] args) {
		String [] chain = "Hello, my name is Denis".split(" ");

		try{
			@SuppressWarnings("unused")
			String wrong = chain[chain.length];
		}catch(ArrayIndexOutOfBoundsException e){
			throw new RuntimeException(e);
		}

	}

}
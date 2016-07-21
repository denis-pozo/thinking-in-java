package org.denispozo.tutorial.thj.exception;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Creating your Own Exceptions
 * Exercise 3
 */

public class ExceptionsEx3 {
	
	public static void main(String[] args) {
		String [] chain = "Hello, my name is Denis".split(" ");

		try{
			@SuppressWarnings("unused")
			String wrong = chain[chain.length];
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}

	}

}
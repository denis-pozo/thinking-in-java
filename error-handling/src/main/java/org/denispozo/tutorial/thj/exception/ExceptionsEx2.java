package org.denispozo.tutorial.thj.exception;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Creating your Own Exceptions
 * Exercise 2
 */

public class ExceptionsEx2 {
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		String nullll = null;

		try{
			nullll.equals("Hello");
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
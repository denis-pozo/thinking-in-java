package org.denispozo.tutorial.thj.exception;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Creating your Own Exceptions
 * Exercise 4
 */

public class ExceptionsEx5 {
	private static int[] ia = new int[2];
	static int x = 5;	
	
	public static void main(String[] args) {
		while(true) {
			try {
				ia[x] = 1;
				System.out.println(ia[x]);
				break;	
			} catch(ArrayIndexOutOfBoundsException e) {
				System.err.println(
					"Caught ArrayIndexOutOfBoundsException");
					e.printStackTrace();
				x--;
			} finally {
				System.out.println("Are we done yet?");		
			}
		}
		System.out.println("Now, we're done.");
	}	
	
}


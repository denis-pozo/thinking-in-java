package org.denispozo.tutorial.thj.exception.finallying;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Performing Cleanup with Finally
 * Example
 */

class ThreeException extends Exception {
	private static final long serialVersionUID = 1L;
}

public class FinallyWorks {
	
	static int count = 0;
	
	public static void main(String[] args) {
		
		while(true){
			try{
				// Post-increment is zero first time:
				if(count++ == 0){
					throw new ThreeException();
				}
				print("No exception");
			} catch (ThreeException te) {
				System.err.println("Caught " + te);
			} finally {
				print("In finally clause");
				if(count == 2) break; // out of while
			}
			
		}
	}
}
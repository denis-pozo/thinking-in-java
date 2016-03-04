package org.denispozo.tutorial.thj.initialization.constructor;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Initialization & Cleanup
 * Exercise 1
 */


public class DefaultInit {
	public String s;
	
	public static void main(String [] args){		
		DefaultInit exOne = new DefaultInit();
		if(exOne.s == null){
			print("The String member has been initialised by default to null");
		} else {
			print("Unexpected behavior, the String member has not been initialised by default to null");
		}
	}
}

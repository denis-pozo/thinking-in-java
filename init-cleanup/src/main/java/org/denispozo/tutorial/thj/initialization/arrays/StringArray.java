package org.denispozo.tutorial.thj.initialization.arrays;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Initialization & Cleanup
 * Section - Default Constructors
 * Exercise 16
 */

public class StringArray {
	
	public static void main(String [] args){
		String [] str = new String[]{"Hi", "Im", "Forrest"};
		for(String s : str){
			print(s);
		}
	}
}

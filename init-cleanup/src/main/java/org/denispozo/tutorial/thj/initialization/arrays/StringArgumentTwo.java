package org.denispozo.tutorial.thj.initialization.arrays;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Initialization & Cleanup
 * Section - Default Constructors
 * Exercise 18
 */

public class StringArgumentTwo {
	
	public StringArgumentTwo(String str){
		print("Hey, " + str);
	}

	public static void main(String[] args) {
		StringArgumentTwo [] str = new StringArgumentTwo[2];
		str[0] = new StringArgumentTwo("First comes first");
		str[1] = new StringArgumentTwo("Second comes second");

	}

}

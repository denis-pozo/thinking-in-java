package org.denispozo.tutorial.thj.initialization.arrays;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Initialization & Cleanup
 * Section - Default Constructors
 * Exercise 17
 */

public class StringArgument {
	
	public StringArgument(String str){
		print("Hey, " + str);
	}

	public static void main(String[] args) {
		StringArgument [] str = new StringArgument[2];
		str.toString();
//		str[0] = new StringArgument("First comes first");
//		str[1] = new StringArgument("Second comes second");

	}

}

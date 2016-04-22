package org.denispozo.tutorial.thj.initialization.statics;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Initialization & Cleanup
 * Section - Default Constructors
 * Exercise 14
 */

public class StaticString {
	
	static String s1 = "First static string";
	static String s2;
	
	static{
		s2 = "Second static string";
	}
	
	public static void printStrings(){
		print(s1);
		print(s2);
	}

	public static void main(String[] args) {
		StaticString.printStrings();

	}

}

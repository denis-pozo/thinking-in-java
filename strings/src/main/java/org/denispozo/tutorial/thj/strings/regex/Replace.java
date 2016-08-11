package org.denispozo.tutorial.thj.strings.regex;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Strings
 * Section - Regular Expressions
 * Example
 */

public class Replace {
	public static String knights = "Then, when you have found the shrubbery, " +
								   "you must cut down the mightiest tree in " +
								   "the forest... with... a herring!";
	
	public static void main(String[] args) {
		print(knights.replaceFirst("f\\w+", "located"));
		print(knights.replaceAll("shrubbery|tree|herring", "banana"));
	}
}
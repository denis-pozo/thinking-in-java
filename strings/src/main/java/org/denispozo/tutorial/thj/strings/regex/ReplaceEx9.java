package org.denispozo.tutorial.thj.strings.regex;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Strings
 * Section - Regular Expressions
 * Example
 */

public class ReplaceEx9 {
	public static String knights = "Then, when you have found the shrubbery, " +
								   "you must cut down the mightiest tree in " +
								   "the forest... with... a herring!";
	
	public static void main(String[] args) {
		print(knights.replaceAll("[aeiou]", "_"));
	}
}
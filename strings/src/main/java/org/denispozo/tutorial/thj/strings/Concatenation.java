package org.denispozo.tutorial.thj.strings;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Strings
 * Section - Overloading + vs StringBuilder
 * Example
 */

public class Concatenation {
	
	public static void main(String[] args) {
		String mango = "mango";
		String s = "abc" + mango + "def" + 47;
		print(s);
	}
}
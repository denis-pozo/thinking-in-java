package org.denispozo.tutorial.thj.strings;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Strings
 * Section - Immutable Strings
 * Example
 */

public class Immutable {
	
	public static String upcase(String s){
		return s.toUpperCase();
	}

	public static void main(String[] args) {
		String q = "howdy";
		print(q);
		String qq = upcase(q);
		print(qq);
		print(q);
		
	}
}
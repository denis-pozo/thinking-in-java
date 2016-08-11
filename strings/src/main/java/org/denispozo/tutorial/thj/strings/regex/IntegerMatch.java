package org.denispozo.tutorial.thj.strings.regex;

/*
 * Chapter - Strings
 * Section - The Formatter Class
 * Example
 */

public class IntegerMatch {
	
	public static void main(String[] args) {
		System.out.println("-1234".matches("-?\\d+"));
		System.out.println("5678".matches("-?\\d+"));
		System.out.println("+991".matches("-?\\d+"));
		System.out.println("+991".matches("(-|\\+)?\\d+"));
		
		
	}
}
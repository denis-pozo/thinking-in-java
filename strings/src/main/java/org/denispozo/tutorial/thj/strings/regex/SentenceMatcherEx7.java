package org.denispozo.tutorial.thj.strings.regex;

/*
 * Chapter - Strings
 * Section - Regular Expressions
 * Exercise 7
 */

public class SentenceMatcherEx7 {
	
	public static boolean isASentence(String isSentence){
		return isSentence.matches("^[A-Z].*[\\.]$");
	}
}
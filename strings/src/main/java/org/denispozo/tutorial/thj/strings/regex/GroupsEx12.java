package org.denispozo.tutorial.thj.strings.regex;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Chapter - Strings
 * Section - Pattern and Matcher
 * Exercise 12
 */

public class GroupsEx12 {
	static public final String POEM = 
			"Twas brillig, and the slithy toves\n" +
			"Did gyre and gimble in the wabe.\n" +
			"All mimsy were the borogoves,\n" +
			"And the mome raths outgrabe.\n\n" +
			"Beware the Jabberwock, my son,\n" +
			"The jaws that bite, the claws that catch.\n" +
			"The frumious Bandersnatch.\n";

	public static void main(String[] args) {
		Matcher m = Pattern.compile("(^[a-z]|\\s+[a-z])\\w+")
						.matcher(POEM);
		Set<String> words = new TreeSet<String>();
		
		while(m.find()){
			words.add(m.group());
		}
		
		print("Number of unique words that do not start with capital letters: " + words.size());
		print(words);
	}
}
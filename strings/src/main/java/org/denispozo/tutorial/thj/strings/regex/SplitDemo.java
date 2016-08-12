package org.denispozo.tutorial.thj.strings.regex;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.Arrays;
import java.util.regex.Pattern;

/*
 * Chapter - Strings
 * Section - Pattern and Matcher
 * Example
 */

public class SplitDemo {
		
	public static void main(String[] args) {
		String input = "This!!unusual use!!of exclamation!!points";
		print(Arrays.toString(Pattern.compile("!!").split(input)));
		print(Arrays.toString(Pattern.compile("!!").split(input,3)));
	}
}
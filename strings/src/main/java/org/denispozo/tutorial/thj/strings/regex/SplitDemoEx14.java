package org.denispozo.tutorial.thj.strings.regex;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.Arrays;

/*
 * Chapter - Strings
 * Section - Pattern and Matcher
 * Exercise 14
 */

public class SplitDemoEx14 {
		
	public static void main(String[] args) {
		String [] splittedOne = "This!!unusual use!!of exclamation!!points".split("!!");
		String [] splittedTwo = "This!!unusual use!!of exclamation!!points".split("!!", 3);
		print(Arrays.toString(splittedOne));
		print(Arrays.toString(splittedTwo));
	}
}
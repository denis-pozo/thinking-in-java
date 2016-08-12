package org.denispozo.tutorial.thj.strings.regex;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Chapter - Strings
 * Section - Pattern and Matcher
 * Exercise 11
 */

public class TestRegularExpressionEx11 {
	
	public static void main(String[] args) {
		
		String input = "Arline ate eight apples and one orange while Anita hadn't any";
		List<String> regexList = Arrays.asList("(?i)((ˆ[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
		
		print("Input: \"" + input + "\"");
		for(String regex : regexList) {
			print("Regular expression: \"" + regex + "\"");
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(input);
			while(m.find()){
				print("Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1));
			}
		}
		
	}
}
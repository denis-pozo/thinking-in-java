package org.denispozo.tutorial.thj.strings.regex;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Chapter - Strings
 * Section - Pattern and Matcher
 * Exercise 10
 */

public class TestRegularExpressionEx10 {
	
	public static void main(String[] args) {
		
		String input = "Java now has regular expressions";
		List<String> regexList = Arrays.asList("^Java",
												"\\Breg.*",
												"n.w\\s+h(a|i)s",
												"s?",
												"s*",
												"s+",
												"s{4}",
												"s{1}.",
												"s{0,3}");
		
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
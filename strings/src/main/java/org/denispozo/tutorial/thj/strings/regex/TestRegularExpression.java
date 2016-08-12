package org.denispozo.tutorial.thj.strings.regex;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Chapter - Strings
 * Section - Pattern and Matcher
 * Example
 */

public class TestRegularExpression {
	
	public static void main(String[] args) {
		
		String input = "abcabcabcdefabc";
		List<String> regexList = Arrays.asList("abcabcabcdefabc", "abc+", "(abc)+", "(abc){2,}" );
		
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
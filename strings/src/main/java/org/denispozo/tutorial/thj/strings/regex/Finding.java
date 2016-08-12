package org.denispozo.tutorial.thj.strings.regex;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;
import static org.denispozo.tutorial.thj.util.PrintUtil.printnr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Chapter - Strings
 * Section - Pattern and Matcher
 * Example
 */

public class Finding {
	
	public static void main(String[] args) {
		Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");
		
		while(m.find()){
			printnr(m.group());
		}
		print();
		
		int i = 0;
		while(m.find(i)){
			printnr(m.group() + " ");
			i++;
		}
	}
}
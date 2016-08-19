package org.denispozo.tutorial.thj.strings.regex;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.denispozo.tutorial.thj.util.TextFile;

/*
 * Chapter - Strings
 * Section - Regular Expressions and Java I/O
 * Exercise 18 
 */


public class StringSeekerEx18 {
	public static void main(String [] args){
//		if(args.length < 1) { 
//			print("Usage: java StringSeekerEx18 file regex flag");
//			System.exit(0);
//		}
		String args0 = "src/main/java/org/denispozo/tutorial/thj/strings/regex/StringSeekerEx18.java";
		
		Pattern p = Pattern.compile("\".*\"");
		int index = 0;
		Matcher m = p.matcher("");
		print(args0 + " string literals: ");
		for(String line : new TextFile(args0)){
			m.reset(line);
			while(m.find()){
				print(index++ + ": " + m.group());
			}
		}
	}
}



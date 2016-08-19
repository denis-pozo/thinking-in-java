package org.denispozo.tutorial.thj.strings.regex;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.denispozo.tutorial.thj.util.TextFile;

/*
 * Chapter - Strings
 * Section - Regular Expressions and Java I/O
 * Exercise 19 
 */


public class ClassNamesSeekerEx19 {
	public static void main(String [] args){
//		if(args.length < 1) { 
//			print("Usage: java ClassNamesSeekerEx19 file regex flag");
//			System.exit(0);
//		}
		String args0 = "src/main/java/org/denispozo/tutorial/thj/strings/regex/ClassNamesSeekerEx19.java";
		
		Pattern p = Pattern.compile("class \\w+\\s+");
		Pattern q = Pattern.compile("^(//|/\\*|\\*)");
		int index = 0;
		Matcher m = p.matcher("");
		Matcher n = q.matcher("");
		print(args0 + " string literals: ");
		for(String line : new TextFile(args0)){
			m.reset(line);
			n.reset(line);
			while(m.find() && !n.find()){
				print(index++ + ": " + m.group());
			}
		}
	}
}



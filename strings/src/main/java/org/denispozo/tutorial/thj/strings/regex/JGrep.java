package org.denispozo.tutorial.thj.strings.regex;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.denispozo.tutorial.thj.util.TextFile;

/*
 * Chapter - Strings
 * Section - Regular Expressions and Java I/O
 * Example
 */


public class JGrep {
	public static void main(String [] args){
		String args0 = "src/main/java/org/denispozo/tutorial/thj/strings/regex/JGrep.java";
		
		String args1 = "\\b[Ssct]\\w+";
		
		Pattern p = Pattern.compile(args1);
		int index = 0;
		Matcher m = p.matcher("");
		
		for(String line : new TextFile(args0)){
			m.reset(line);
			while(m.find()){
				print(index++ + ": " +
						m.group() + ": " + m.start());
			}
		}
		
	}
}
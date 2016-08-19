package org.denispozo.tutorial.thj.strings.regex;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.denispozo.tutorial.thj.util.TextFile;

/*
 * Chapter - Strings
 * Section - Regular Expressions and Java I/O
 * Exercise 17 
 */


public class CommentSeekerEx17 {
	public static void main(String [] args){
//		if(args.length < 1) { 
//			print("Usage: java CommentSeekerEx17 file regex flag");
//			System.exit(0);
//		}
		String args0 = "src/main/java/org/denispozo/tutorial/thj/strings/regex/CommentSeekerEx17.java";
		
		Pattern p = Pattern.compile("(//\\s.+)|(/\\*\\s+.+)|(\\*\\s+.+)");
		int index = 0;
		Matcher m = p.matcher("");
		print(args0 + " comments: ");
		for(String line : new TextFile(args0)){
			m.reset(line);
			while(m.find()){
				print(index++ + ": " + m.group());
			}
		}
	}
}



package org.denispozo.tutorial.thj.strings.regex;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.denispozo.tutorial.thj.util.TextFile;

/*
 * Chapter - Strings
 * Section - Regular Expressions and Java I/O
 * Exercise 15
 */


public class JGrepEx15 {
	public static void main(String [] args){
		
		if(args.length < 3) { 
			print("Usage: java JGrepEx15 file regex flag");
			System.exit(0);
		}
		
		int flag = 0;
		
		if(args[2].equals("Pattern.CASE_INSENSITIVE")){
			flag = Pattern.CASE_INSENSITIVE;
		} else if(args[2].equals("Pattern.CANON_EQ")){
			flag = Pattern.CANON_EQ;
		} else if(args[2].equals("Pattern.COMMENTS")){
			flag = Pattern.COMMENTS;
		} else if(args[2].equals("Pattern.DOTALL")){
			flag = Pattern.DOTALL;
		} else if(args[2].equals("Pattern.LITERAL")){
			flag = Pattern.LITERAL;
		} else if(args[2].equals("Pattern.MULTILINE")){
			flag = Pattern.MULTILINE;
		} else if(args[2].equals("Pattern.UNIX_LINES")){
			flag = Pattern.UNIX_LINES;
		} 

		Pattern p = Pattern.compile(args[1], flag);
		// Iterate through the lines of the input file:
		int index = 0;
		Matcher m = p.matcher(""); // creates empty Matcher object
		
		for(String line : new TextFile(args[0])){
			m.reset(line);
			while(m.find()){
				print(index++ + ": " +
						m.group() + ": " + m.start());
			}
		}
		
	}
}


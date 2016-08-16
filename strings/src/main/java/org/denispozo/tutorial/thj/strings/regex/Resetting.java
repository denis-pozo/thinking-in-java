package org.denispozo.tutorial.thj.strings.regex;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;
import static org.denispozo.tutorial.thj.util.PrintUtil.printnr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Chapter - Strings
 * Section - Matcher.reset()
 * Example
 */


public class Resetting {
	public static void main(String [] args){
		Matcher m = Pattern.compile("[frb][aiu][gx]").matcher("fix the rug with bags");
		
		while(m.find()){
			printnr(m.group() + " ");
		}
		print();
		
		m.reset("fix the rig with rags");
		while(m.find()){
			printnr(m.group() + " ");
		}
	
	}
}
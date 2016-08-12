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

public class Groups {
	static public final String POEM = 
			"Twas brillig, and the slithy toves\n" +
			"Did gyre and gimble in the wabe.\n" +
			"All mimsy were the borogoves,\n" +
			"And the mome raths outgrabe.\n\n" +
			"Beware the Jabberwock, my son,\n" +
			"The jaws that bite, the claws that catch.\n" +
			"The frumious Bandersnatch.\n";

	public static void main(String[] args) {
		Matcher m = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$")
						.matcher(POEM);
		
		while(m.find()){
			for(int j = 0 ; j <= m.groupCount() ; j++){
				printnr("[" + m.group(j) + "]");
			}
			print();
		}
	}
}
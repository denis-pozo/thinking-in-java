package org.denispozo.tutorial.thj.strings.tokenizer;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;
import static org.denispozo.tutorial.thj.util.PrintUtil.printnr;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Chapter - Strings
 * Section - String Tokenizer (worse than scanner with regex)
 * Cite - "It seems safe to say that the StringTokenizer is obsolete"
 * Example
 */

public class ReplacingStringTokenizer {
	
	public static void main(String[] args) {
		String input = "But I'm not dead yet! I feel happy!";
		StringTokenizer stoke = new StringTokenizer(input);
		
		while(stoke.hasMoreElements()){
			printnr(stoke.nextToken() + " ");
		}
		
		print();
		print(Arrays.toString(input.split(" ")));
		Scanner scanner = new Scanner(input);
		while(scanner.hasNext()){
			printnr(scanner.next() + " ");
		}
		scanner.close();
	}
	
}
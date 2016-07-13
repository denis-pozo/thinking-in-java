package org.denispozo.tutorial.thj.holding.objects.set;

import java.util.Set;
import java.util.TreeSet;

import org.denispozo.tutorial.thj.util.TextFile;
import static org.denispozo.tutorial.thj.util.PrintUtil.*;
/*
 * Chapter - Holding your objects
 * Section - Set
 * Exercise 16
 */

public class UniqueWordsEx16 {
	
	public static void main(String[] args) {
		int count = 0;
		Set<String> words = new TreeSet<String>(new TextFile("pom.xml", "\\W+"));
		Set<Character> characters = new TreeSet<Character>();
		for(String word : words){
			print(word + " has " + word.length() + " characters");
			for(Character ch : word.toCharArray()){
				count ++;
				characters.add(ch);
			}
			
		}
		print("Characters inserted: " + count);
		print("Characters stored: " + characters.size());
		print(characters);
	}

	 
}

package org.denispozo.tutorial.thj.holding.objects.map;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.denispozo.tutorial.thj.util.TextFile;

/*
 * Chapter - Holding your objects
 * Section - Map
 * Exercise 20
 */

public class UniqueWordsWithOccurrenceCounterEx20 {
	
	public static void main(String[] args) {
		int count = 0;
		Map<Character, Integer> vowels = new HashMap<Character, Integer>();
		Set<String> words = new TreeSet<String>(new TextFile("quixote.txt", "\\W+"));
		
		for(String word : words){
			print(word + " has " + word.length() + " characters");
			for(Character ch : word.toCharArray()){
				count ++;
				int vowelCounter = 0;
				
				if(vowels.containsKey(ch)){
					vowelCounter = vowels.get(ch);
				}
				vowels.put(ch, vowelCounter+1);
			}
			
		}
		print("Characters inserted: " + count);
		print("Characters stored: " + vowels.size());
		print(vowels);
	}

	 
}

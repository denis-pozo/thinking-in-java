package org.denispozo.tutorial.thj.holding.objects.map;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.denispozo.tutorial.thj.util.TextFile;

/*
 * Chapter - Holding your objects
 * Section - Map
 * Exercise 21
 */

public class UniqueWordsEx21 {
	
	public static void main(String[] args) {
		int count = 0;
		List<String> wordSet = new ArrayList<String>(new TextFile("quixote.txt", "\\W+"));
		Collections.sort(wordSet, String.CASE_INSENSITIVE_ORDER);
		Map<String, Integer> words = new LinkedHashMap<String, Integer>();
		
		for(String word : wordSet){
			count ++;
			int wordCounter = 0;
			
			if(words.containsKey(word)){
				wordCounter = words.get(word);
			}
			words.put(word, wordCounter+1);
		}
			
		print("Words inserted: " + count);
		print("Words stored: " + words.size());
		print(words);
		
	}

	 
}

package org.denispozo.tutorial.thj.holding.objects.ex25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.denispozo.tutorial.thj.util.TextFile;

/*
 * Chapter - Holding your objects
 * Section - Map
 * Exercise 25
 */
public class Ex25 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Map<String,ArrayList<Integer>> m = 
			new LinkedHashMap<String,ArrayList<Integer>>();
		List<String> words = new LinkedList<String>();
		words.addAll(new TextFile("quixote.txt", "\\W+"));
		System.out.println("Words in file: " + words);
		Iterator itWords = words.iterator();
		int count = 0;
		while(itWords.hasNext()) {
			String s = (String)itWords.next();
			count++;			
			if(!m.keySet().contains(s)) {	
				ArrayList<Integer> ai = 
					new ArrayList<Integer>();		
				ai.add(0, count);
				m.put(s, ai);
			}
			else {
				m.get(s).add(count);
				m.put(s, m.get(s));  	
			}
		}
		System.out.println("Map of word locations: " + m);			
	}	
}
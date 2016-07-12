package org.denispozo.tutorial.thj.holding.objects.ex22;

/*
 * Chapter - Holding your objects
 * Section - Map
 * Exercise 22
 */
import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.denispozo.tutorial.thj.util.TextFile;

class Word {
	static int totalWords = 0;	
	String s;	
	int count;
	Word(String s, int count) { 
		this.s = s; 
		this.count = count;
		totalWords++;
	}
	public String toString() { return s + ": " + count; }
}

public class UniqueWords22 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>(
			new TextFile("quixote.txt", "\\W+"));		
		Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
		System.out.println("Words to count, sorted: " + words);
		Set<Word> wordObjects = new HashSet<Word>();
		Iterator it = words.iterator();	
		while(it.hasNext()) {
			String s = (String)it.next();
			int count = 0;			
			for(int i = 0; i < words.size(); i++) {
				if(s.equals(words.get(i))) count++;
			}
			Word w = new Word(s, count);
			wordObjects.add(w);
		}		
		
		print("Word count: " + wordObjects);
		print("Total words: " + Word.totalWords);		
	}		
}
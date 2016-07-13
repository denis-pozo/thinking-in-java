package org.denispozo.tutorial.thj.holding.objects;

import static org.denispozo.tutorial.thj.util.PrintUtil.printnr;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * Chapter - Holding your objects
 * Section - Foreach and Iterators
 * Book Example
 */

public class IterableClass implements Iterable<String> {
	
	protected String[] words = ("And that is how we know the Earth to be banana-shaped").split(" ");

	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			private int index = 0;
			
			public boolean hasNext(){
				return index < words.length;
			}
			
			public String next() {
				return words[index++];
			}
			
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public static void main(String[] args) {
		for(String s : new IterableClass()){
			printnr(s);
		}
	}
	
}

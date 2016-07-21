package org.denispozo.tutorial.thj.holding.objects.iterable;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;
import static org.denispozo.tutorial.thj.util.PrintUtil.printnr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.denispozo.tutorial.thj.holding.objects.IterableClass;

/*
 * Chapter - Holding your objects
 * Section - The Adapter Method idiom
 * Book Example
 */

public class MultiIterableClass extends IterableClass {

	public Iterable<String> reversed() {
		return new Iterable<String>() {
			public Iterator<String> iterator() {
				return new Iterator<String>() {
					int current = words.length -1;
					
					@Override
					public boolean hasNext() {
						return current > -1;
					}
					
					@Override
					public String next() {
						return words[current--];
					}
					
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
	
	public Iterable<String> randomized() {
		return new Iterable<String>() {
			public Iterator<String> iterator() {
				List<String> shuffled = new ArrayList<String>(Arrays.asList(words));
				Collections.shuffle(shuffled, new Random(47));
				return shuffled.iterator();
			}
		};
	}
		
	public static void main(String[] args) {
		MultiIterableClass mic = new MultiIterableClass();
		for(String s : mic.reversed()){
			printnr(s);
		}
		print();
		for(String s : mic.randomized()){
			printnr(s);
		}
		print();
		for(String s : mic){
			printnr(s);
		}
	}
}

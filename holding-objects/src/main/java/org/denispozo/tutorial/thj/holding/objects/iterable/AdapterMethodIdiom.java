package org.denispozo.tutorial.thj.holding.objects.iterable;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/*
 * Chapter - Holding your objects
 * Section - InterfaceVsIterator
 * Book Example
 */

public class AdapterMethodIdiom {

	public static void main(String[] args) {
		ReversibleArrayList<String> ral = new ReversibleArrayList<String>(Arrays.asList("To be or not to be".split(" ")));
		for(String s : ral){
			printnr(s);
		}
		print();
		for(String s : ral.reversed()){
			printnr(s);
		}
		print();
	}
}

@SuppressWarnings("serial")
class ReversibleArrayList<T> extends ArrayList<T> {
	
	public ReversibleArrayList(Collection<T> collection) { 
		super(collection);
	}
	
	public Iterable<T> reversed() {
		return new Iterable<T>() {
			public Iterator<T> iterator() {
				return new Iterator<T>() {
					int current = size()-1;
					public boolean hasNext(){
						return current > -1;
					}
					public T next(){
						return get(current--);
					}
					public void remove() {
						throw new UnsupportedOperationException();
					}					
				};
			}
		};
	}
}
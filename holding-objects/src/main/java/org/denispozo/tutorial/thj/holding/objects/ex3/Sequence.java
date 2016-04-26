package org.denispozo.tutorial.thj.holding.objects.ex3;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import java.util.ArrayList;
import java.util.List;

/*
 * Chapter - Holding your Objects
 * Section - Basic concepts
 * Exercise 3
 */

public class Sequence {

	private List<Object> items;
	
	public Sequence () {
		items = new ArrayList<Object>();
	}
	
	public void add(Object obj){
		items.add(obj);
	}
	
	public Selector selector() {
		return new SequenceSelector();
	}
	
	private class SequenceSelector implements Selector {
		
		private int i = 0;
		
		@Override
		public boolean end() {
			return (i == items.size());
		}

		@Override
		public Object current() {
			return items.get(i);
		}

		@Override
		public void next() {
			if(i < items.size()){
				i++;
			}
		}
		
		@SuppressWarnings("unused")
		public Sequence getSequence() {
			return Sequence.this;
		}
	}
	
	public static void main (String [] args) {
		Sequence sequence = new Sequence();
		sequence.add(new StringHolder("Hey"));
		sequence.add(new StringHolder("Berlin"));
		sequence.add(new StringHolder("World"));
		sequence.add(new StringHolder("good morning"));
		
		Selector selector = sequence.selector();
		
		while(!selector.end()){
			print(selector.current());
			selector.next();
		}
		
	}
}

package org.denispozo.tutorial.thj.holding.objects;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import java.util.ArrayList;
import java.util.List;

/*
 * Chapter - Holding your Objects
 * Section - Basic concepts
 * Exercise 3
 */

public class SequenceEx3 {

	private List<Object> items;
	
	public SequenceEx3 () {
		items = new ArrayList<Object>();
	}
	
	public void add(Object obj){
		items.add(obj);
	}
	
	public SelectorEx3 selector() {
		return new SequenceSelector();
	}
	
	private class SequenceSelector implements SelectorEx3 {
		
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
		public SequenceEx3 getSequence() {
			return SequenceEx3.this;
		}
	}
	
	public static void main (String [] args) {
		SequenceEx3 sequence = new SequenceEx3();
		sequence.add(new StringHolderEx3("Hey"));
		sequence.add(new StringHolderEx3("Berlin"));
		sequence.add(new StringHolderEx3("World"));
		sequence.add(new StringHolderEx3("good morning"));
		
		SelectorEx3 selector = sequence.selector();
		
		while(!selector.end()){
			print(selector.current());
			selector.next();
		}
		
	}
}

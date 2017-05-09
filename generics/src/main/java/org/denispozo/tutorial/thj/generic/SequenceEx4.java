package org.denispozo.tutorial.thj.generic;

import static org.denispozo.tutorial.thj.util.PrintUtil.printnr;

import java.util.ArrayList;
import java.util.List;

import org.denispozo.tutorial.thj.innerclasses.inandout.Selector;

/*
 * Chapter - Generics
 * Section - The Tuple Library
 * Exercise 4
 */

public class SequenceEx4<E> {

	private List<E> list = new ArrayList<E>();
	
	public SequenceEx4 (List<E> list) {
		this.list = list;
	}
	
	public void add(E e){
		list.add(e);
	}
	
	public Selector selector() {
		return new SequenceSelector();
	}
	
	private class SequenceSelector implements Selector {
		
		private int i = 0;
		
		@Override
		public boolean end() {
			return (i == list.size());
		}

		@Override
		public Object current() {
			return list.get(i);
		}

		@Override
		public void next() {
			if(i < list.size()){
				i++;
			}
		}
	}
	
	public static void main (String [] args) {
		List<String> ls = new ArrayList<String>();
		SequenceEx4<String> gs = new SequenceEx4<String>(ls);
		for(int i = 0 ; i < 10 ; i++){
			gs.add(Integer.toString(i));
		}
		Selector selector = gs.selector();
		while(!selector.end()){
			printnr(selector.current() + " ");
			selector.next();
		}		
	}
}

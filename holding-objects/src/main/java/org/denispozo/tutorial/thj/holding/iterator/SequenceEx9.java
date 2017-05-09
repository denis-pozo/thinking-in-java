package org.denispozo.tutorial.thj.holding.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Chapter - Holding your objects
 * Section - Iterator
 * Exercise 9
 */

public class SequenceEx9 {

	private ArrayList<Object> items = new ArrayList<Object>();
	
	public void add(Object obj){
		items.add(obj);
	}
	
	public Iterator<Object> iterator() {
		return items.iterator();
	}
	
	public static void main (String [] args) {
		SequenceEx9 sequence = new SequenceEx9();
		
		for(int i = 0 ; i<10 ; i ++){
			sequence.add(Integer.toString(i));
		}
		
		Iterator<Object> it = sequence.iterator();
		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}
	}
}

package org.denispozo.tutorial.thj.holding.objects.ex09;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Chapter - Holding your objects
 * Section - Iterator
 * Exercise 9
 */

public class Sequence {

	private ArrayList<Object> items = new ArrayList<Object>();
	
	public void add(Object obj){
		items.add(obj);
	}
	
	public Iterator<Object> iterator() {
		return items.iterator();
	}
	
	public static void main (String [] args) {
		Sequence sequence = new Sequence();
		
		for(int i = 0 ; i<10 ; i ++){
			sequence.add(Integer.toString(i));
		}
		
		Iterator<Object> it = sequence.iterator();
		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}
	}
}

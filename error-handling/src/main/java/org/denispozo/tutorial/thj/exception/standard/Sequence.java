package org.denispozo.tutorial.thj.exception.standard;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

import org.denispozo.tutorial.thj.innerclasses.inandout.Selector;
import org.denispozo.tutorial.thj.innerclasses.inandout.StringHolder;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Standard Java Exceptions
 * Exercise 12
 */

public class Sequence {

	private Object [] items;
	private int next = 0;
	
	public Sequence (int size) {
		items = new Object[size];
	}
	
	public void add(Object obj) throws ArrayIndexOutOfBoundsException {
		if(next < items.length){
			items[next++] = obj;
		} else {
			throw new ArrayIndexOutOfBoundsException("Array (size " + items.length + ") is full");
		}
	}
	
	public Selector selector() {
		return new SequenceSelector();
	}
	
	private class SequenceSelector implements Selector {
		
		private int i = 0;
		
		@Override
		public boolean end() {
			return (i == items.length);
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void next() {
			if(i < items.length){
				i++;
			}
		}
		
		@SuppressWarnings("unused")
		public Sequence getSequence() {
			return Sequence.this;
		}
	}
	
	public static void main (String [] args) {
		Sequence sequence = new Sequence(4);
		sequence.add(new StringHolder("Hey"));
		sequence.add(new StringHolder("Berlin"));
		sequence.add(new StringHolder("World"));
		sequence.add(new StringHolder("good morning"));
		sequence.add(new StringHolder("good morning"));
		
		Selector selector = sequence.selector();
		
		while(!selector.end()){
			print(selector.current());
			selector.next();
		}
		
	}}
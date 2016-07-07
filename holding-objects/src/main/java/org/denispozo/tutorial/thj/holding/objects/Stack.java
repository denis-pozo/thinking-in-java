package org.denispozo.tutorial.thj.holding.objects;

import java.util.LinkedList;

public class Stack<T> {
	
	private LinkedList<T> storage = new LinkedList<T>();
	
	public void push(T v) { storage.addFirst(v); }
	public T peak() { return storage.getFirst(); }
	public T pop() { return storage.removeFirst(); }
}

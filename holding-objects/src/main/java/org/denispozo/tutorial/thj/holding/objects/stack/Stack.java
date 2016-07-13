package org.denispozo.tutorial.thj.holding.objects.stack;

import java.util.LinkedList;

/*
 * Chapter - Holding your objects
 * Section - Stack
 * Book Example
 */

public class Stack<T> {
	
	private LinkedList<T> storage = new LinkedList<T>();
	
	public void push(T v) { storage.addFirst(v); }
	public T peak() { return storage.getFirst(); }
	public T pop() { return storage.removeFirst(); }
	public boolean empty() { return storage.isEmpty(); }
	
	@Override
	public String toString() {
		return storage.toString();
	}
}
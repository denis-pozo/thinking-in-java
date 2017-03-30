package org.denispozo.tutorial.thj.generics;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Generics
 * Section - A Stack class
 * Example
 */

public class LinkedStack<T> {
	
	private Node<T> top = new Node<T>(); // End sentinel

	public void push(T item) { 
		top = new Node<T>(item, top);
	}
	
	public T pop() {
		T result = top.item;
		if (!top.end()){
			top = top.next;
		}
		return result;
	}
	
	private static class Node<U> {
		U item;
		Node<U> next;
		
		Node() {
			item = null;
			next = null;
		}
		
		Node(U item, Node<U> next) {
			this.item = item;
			this.next = next;
		}
		
		boolean end() {
			return item == null && next == null;
		}
	}
	
	public static void main(String[] args) {
		LinkedStack<String> lss = new LinkedStack<String>();
		for(String s : "Phasers on stun!".split(" "))
			lss.push(s);
		String s;
		while((s = lss.pop()) != null){
			print(s);
		}
	}
}

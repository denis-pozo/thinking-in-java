package org.denispozo.tutorial.thj.generic;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Generics
 * Section - A Stack class
 * Exercise 5
 */

public class LinkedStackEx5<T> {
	
	private Node top = new Node(); // End sentinel
		
	public void push(T item) { 
		top = new Node(item, top);
	}
	
	public T pop() {
		T result = top.item;
		if (!top.end()){
			top = top.next;
		}
		return result;
	}
	
	private class Node {
		T item;
		Node next;
				
		Node() {
			item = null;
			next = null;
		}
		
		Node(T item, Node next) {
			this.item = item;
			this.next = next;
		}
		
		boolean end() {
			return item == null && next == null;
		}
	}
	
	public static void main(String[] args) {
		LinkedStackEx5<String> lss = new LinkedStackEx5<String>();
		for(String s : "Phasers on stun!".split(" "))
			lss.push(s);
		String s;
		while((s = lss.pop()) != null){
			print(s);
		}
	}
}

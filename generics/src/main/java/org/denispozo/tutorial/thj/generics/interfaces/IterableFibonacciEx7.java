package org.denispozo.tutorial.thj.generics.interfaces;

import java.util.Iterator;

/*
 * Chapter - Generics
 * Section - Generic Interfaces
 * Exercise 7
 */

public class IterableFibonacciEx7 implements Iterable<Integer>{
	private Fibonacci fibo;
	private int n;
	
	public IterableFibonacciEx7(int count) {
		n = count;
		fibo = new Fibonacci();
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			public boolean hasNext() { return n > 0; }
			public Integer next() {
				n--;
				return fibo.next();
			}
		};
	}
	
	public static void main(String[] args) {
		for(int i : new IterableFibonacciEx7(18)){
			System.out.print(i + " ");
		}
	}

}

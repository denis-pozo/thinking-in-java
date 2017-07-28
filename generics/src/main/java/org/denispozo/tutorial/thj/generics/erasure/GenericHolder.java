package org.denispozo.tutorial.thj.generics.erasure;

/*
 * Chapter - Generics
 * Section - The Action of Boundaries
 * Example
 */

public class GenericHolder<T> {
	private T obj;
	
	public void set(T obj) {
		this.obj = obj;
	}
	
	public T get() {
		return obj;
	}
	
	public static void main(String[] args) {
		GenericHolder<String> holder = new GenericHolder<String>();
		holder.set("Item");
		String s = holder.get();
		System.out.println(s);
	}
}

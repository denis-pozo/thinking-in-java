package org.denispozo.tutorial.thj.generics.erasure;

/*
 * Chapter - Generics
 * Section - The Action of Boundaries
 * Example
 */

public class SimpleHolder {
	private Object obj;
	
	public void set(Object obj) {
		this.obj = obj;
	}
	
	public Object get() {
		return obj;
	}
	
	public static void main(String[] args) {
		SimpleHolder holder = new SimpleHolder();
		holder.set("Item");
		String s = (String) holder.get();
		System.out.println(s);
	}
}

package org.denispozo.tutorial.thj.generics.erasure;

/*
 * Chapter - Generics
 * Section - The C++ Approach
 * Example
 */

public class ReturnGenericType<T extends HasF> {
	private T obj;
	
	public ReturnGenericType(T obj){
		this.obj = obj;
	}
	
	public T get() {
		return obj;
	}
}


